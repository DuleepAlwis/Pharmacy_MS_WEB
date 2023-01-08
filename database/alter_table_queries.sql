SELECT * FROM pharmacy_db.order_tb;
select * from pharmacy_db.medicine_tb;
select * from pharmacy_db.purchase_tb;
alter table purchase_tb add column type varchar(255);
alter table purchase_tb add column received char(15);
alter table order_tb add column purchase_id int;
ALTER TABLE order_tb ADD CONSTRAINT fk_purchase_id FOREIGN KEY (`purchase_id`) REFERENCES purchase_tb(`purchase_id`);

