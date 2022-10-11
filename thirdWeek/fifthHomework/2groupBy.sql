select count(*) from Products;
-- Ürün adedini ver

select count(*) from Products where CategoryID = 2;
-- 2 numaralı kategorideki ürün adedini ver



select CategoryID, count(*) from Products group by CategoryID;
-- Hangi kategoride kaç ürün var getir

select CategoryID, count(*) from Products group by CategoryID having count(*) < 10;
-- Ürün sayısı 10'dan az olan kategorileri getir (ürün adedi ile birlikte)