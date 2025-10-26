alter table users drop column passport_number;
alter table users drop column passport_series;

truncate table users cascade;
delete from user_role where role_id in (select id from roles where name = 'ROLE_USER');
delete from roles where name = 'ROLE_USER';