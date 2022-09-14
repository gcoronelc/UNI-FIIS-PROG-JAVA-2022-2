
ALTER TABLE usuarios 
add constraint usuarios_fk 
foreign key (iddepartamento) 
REFERENCES departamentos(id)

ALTER TABLE empleado 
add constraint usuarios_fk 
foreign key (iddepartamento) 
REFERENCES departamento(iddepartamento)

select count(1) cantidad 
from friends_of_pickles 
where species = 'dog'