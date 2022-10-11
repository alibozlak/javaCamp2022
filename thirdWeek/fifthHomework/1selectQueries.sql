-- Select :

Select * from Customers;    
-- Customers tablosundaki bütün sütunları getir

select CustomerName, ContactName, City from Customers;   
-- Customers tablosundaki CustomerName, ContactName ve City sütunlarını getir
-- Alias :
select CustomerName MusteriAdi, ContactName, City Sehir from Customers;
-- CustomerName'i MusteriAdi ve City'i Sehir olarak göster

-- Koşul :
select * from Customers where City = 'London';
-- Şehri Londra olan Müşterileri getir

select * from Products where CategoryID = 1;
-- 1 numaralı kategoriye ait ürünleri getir

select * from Products where CategoryID = 1 or CategoryID = 3;
-- 1 veya 3 olan kategoriye ait ürünleri getir

select * from Products where CategoryID = 1 and Price > 10;
-- 1 numaralı kategoride ürün fiyatı 10'dan büyük olan ürünleri getir 

select * from Products order by ProductName;
-- Ürünleri ürün ismine göre sırala (asc : ascending)

select * from Products order by Price;
-- Ürünleri fiyata göre sırala (artan / asc)

select * from Products order by CategoryID, ProductName;
-- Ürünleri önce CategoryID'ye göre sonra ProductName'e göre sırala

select * from Products order by Price desc;
-- Ürünleri fiyata göre sırala (desc : descending / azalan)

select * from Products where CategoryID = 1 order by Price desc;
-- 1 numaralı kategorideki ürünleri azalan fiyata göre sırala