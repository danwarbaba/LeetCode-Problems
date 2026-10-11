# Write your MySQL query statement below
Select p.product_id,COALESCE(round(sum(u.units*p.price)/sum(u.units), 2), 0) as average_price
from prices p
left join UnitsSold u
ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id