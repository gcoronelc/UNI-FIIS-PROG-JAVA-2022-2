

sp_help curso;

select * from curso;

insert into curso values('aaa',-100,300,'yo',-600);

insert into curso values('Hacer plata en 5 pasos.',30,0,'yo',5000);
go
insert into curso(cur_nombre,cur_vacantes,cur_matriculados,cur_profesor,cur_precio) 
values(?,?,?,?,?) 
go

insert into curso values('Hacer plata rapidito.',30,0,'yo',5000);
