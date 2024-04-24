--Insert to empleado
delete from VENTAS; 
delete from EMPLEADO; 
Insert into EMPLEADO (ID_EMPLEADO,EMP_APELLIDO1,EMP_APELLIDO2,EMP_NOMBRE) values (1,'a','b','c');
Insert into EMPLEADO (ID_EMPLEADO,EMP_APELLIDO1,EMP_APELLIDO2,EMP_NOMBRE) values (2,'d','d','f');
Insert into EMPLEADO (ID_EMPLEADO,EMP_APELLIDO1,EMP_APELLIDO2,EMP_NOMBRE) values (3,'g','h','i');

--Insert to ventas
Insert into VENTAS (ID_VENTA,ID_EMPLEADO,DESCRIPCION_VENTA,VALOR_VENTA) values (1,1,'venta 1',33);
Insert into VENTAS (ID_VENTA,ID_EMPLEADO,DESCRIPCION_VENTA,VALOR_VENTA) values (2,2,'venta 2',66);
Insert into VENTAS (ID_VENTA,ID_EMPLEADO,DESCRIPCION_VENTA,VALOR_VENTA) values (3,1,'venta 3',99);

commit; 