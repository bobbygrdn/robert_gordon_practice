USE `SBA_MOCKUP`;

-- Create a query to return all orders made by users with the first name of "Marion"

select orders.order_id AS ORDER_ID, users.user_id AS USER_ID, stores.store_id AS STORE_ID
from orders
inner join users
on orders.user_id = users.user_id
inner join stores
on orders.store_id = stores.store_id
where users.first_name = 'Marion';

-- Create a query to select all users that have not made an order

select users.user_id AS USER_ID, users.first_name AS FIRST_NAME, users.last_name AS LAST_NAME, users.city AS CITY
from users
left join orders
on users.user_id = orders.user_id
where orders.order_id is null;


-- Create a query to select teh names and prices fo all items that have been part of 2 or more separate orders

select items.name AS NAME, trim(items.price)+0 as PRICE
from items
inner join order_items
on items.item_id = order_items.item_id
inner join orders
on order_items.order_id = orders.order_id
group by items.item_id
having count(orders.order_id) > 1;


-- Create a query to return the Order id, Item name, Item price, and Quantity from orders made at stores in the city "New York". Order by Order id in ascending order

select orders.order_id AS ORDER_ID, items.name AS NAME, Trim(items.price)+0 as PRICE, order_items.quantity AS QUANTITY
from orders
inner join order_items
on orders.order_id = order_items.order_id
inner join items
on order_items.item_id = items.item_id
inner join stores
on orders.store_id = stores.store_id
where stores.city = 'New York'
order by orders.order_id;


-- Your boss would like you to create a query that calculates the total revenue generated by each item. Revenue for an item can be found as (item price * total quantity). Please return the first column as 'ITEM_NAME' and the second column as 'REVENUE'.

select items.name AS ITEM_NAME, sum(trim(items.price * order_items.quantity)+0) as REVENUE
from items
inner join order_items
on items.item_id = order_items.item_id
group by items.item_id;

-- Create a query with the following output:
  -- a. Column 1 Store Name
    -- i. The name of each store
  -- b. Column 2 Order Quantity
    -- i. The number of times an order has been made in this store
  -- c. Column 3 Sales Figure
    -- i. If the store has been involved in more than 3 orders, mark as 'High'
    -- ii. If the store has been involved in less than 3 orders but more than 1 order, mark as 'Medium'
    -- ii. If the store has been involved with 1 or less orders, mark as 'Low'
  -- d. Should be ordered by the order quantity in descending order

select stores.name AS NAME,
count(distinct orders.order_id) AS ORDER_QUANTITY,
    case
        when count(orders.store_id) > 3 then 'High'
        when count(orders.store_id) between 2 and 3 then 'Medium'
        else 'Low'
    end as SALES_FIGURE
from stores
inner join orders
on stores.store_id = orders.store_id
inner join order_items
on orders.order_id = order_items.order_id
inner join items
on order_items.item_id = items.item_id
group by stores.store_id
order by order_quantity desc;
