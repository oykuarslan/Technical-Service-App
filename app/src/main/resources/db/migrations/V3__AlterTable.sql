alter table booking add column system_user_id bigint ,add constraint fk_test foreign key (id) references system_user (id);
alter table booking add column service_id int ,add constraint fk_test2 foreign key (id) references service (id);

alter table sale add column product_id bigint ,add constraint fk_test5 foreign key (id) references product(id);

alter table proposal add column product_id bigint ,add constraint fk_test6 foreign key (id) references product(id);
alter table proposal add column system_user_id bigint ,add constraint fk_test7 foreign key (id) references system_user (id);

alter table sale_log add column system_user_id bigint ,add constraint fk_test8 foreign key (id) references system_user (id);
alter table sale_log add column sale_id bigint ,add constraint fk_test9 foreign key (id) references sale (id);

