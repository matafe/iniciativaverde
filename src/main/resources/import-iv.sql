-- You can use this file to load seed data into the database using SQL statements

-- Member
insert into Member (id, name, email, active, version) values (1, 'Google', 'info@google.com', true, 0);
insert into Member (id, name, email, active, version) values (2, 'UOL', 'info@uol.com.br', true, 0);
-- Site
insert into Site (id, url, page_views, owner_id, version) values (1, 'www.google.com', 1000, 1, 0);
insert into Site (id, url, page_views, owner_id, version) values (2, 'www.uol.com.br',  100, 2, 0);
-- Certificate
insert into Certificate (id, valid_date, site_id, version) values (1, '2010-01-01', 1, 0);
insert into Certificate (id, valid_date, site_id, version) values (2, '2013-01-30', 2, 0);
insert into Certificate (id, valid_date, site_id, version) values (3, '2020-12-25', 2, 0);