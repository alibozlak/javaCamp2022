-- inner join :
select * from Products 
inner join Categories on Products.CategoryID = Categories.CategoryID;

select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName 
from Products inner join Categories on Products.CategoryID = Categories.CategoryID;

-- DTO : Data Transformation Object (C#, Java)

select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName 
from Products inner join Categories on Products.CategoryID = Categories.CategoryID
where Products.Price >= 10;


-- left join :
select * from Products p left join OrderDetails od on p.ProductID = od.ProductID;

select * from Customers c left join Orders o on c.CustomerID = o.CustomerID;

select * from Customers c left join Orders o on c.CustomerID = o.CustomerID
where o.CustomerID is null;


-- İkiden fazla tabloyu joinlemek :
select * from Products p inner join OrderDetails od on p.ProductID = od.ProductID
inner join Orders o on o.OrderID = od.OrderID;