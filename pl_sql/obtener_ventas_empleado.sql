 set serveroutput on;   
 declare  
   type typVentas is record
     (idVenta     ventas.id_venta%type,
      nmValVenta  ventas.valor_venta%type
    ); 
   type emp_ventas is table of typVentas; 
   
   --Objeto para pruebas
   testVentas  emp_ventas;
   
   function obtener_ventas_empleado (empId in ventas.id_empleado%type) return emp_ventas is
       /*
      Object name       : obtener_ventas_empleado.
      Purpose           : Obtener ventas por empelado.
      Input parameters  : identificador del empelado (number). 
      output parameters : N/A.
      Call example      : obtener_ventas_empleado(1)
      Output            : Coleccion de ventas por empleado, null si no se encuentra informacion.
       */
   cursor cuVentas is 
   select id_venta, valor_venta 
   from ventas
   where id_empleado = empId; 
   ventasTotEmp  emp_ventas;
--       
   begin  
     --Para poblar la coleccion se podría hacer un loop. Mas efieciente bulk collect, sin embargo mas uso de memoria.      
     open cuVentas; 
     fetch cuVentas bulk collect into ventasTotEmp; 
     close cuVentas;   
   --
   return ventasTotEmp; 
    exception 
     when no_data_found then 
       return null;
     when others then 
       raise_application_error (-20000, 'Error: obtener_ventas_empleado - ' || substr(sqlerrm, 1, 500)); 
   end obtener_ventas_empleado; 
--
begin 
    --Para la funcin se pordría usar un PIPELINED. 
    testVentas:= obtener_ventas_empleado (1);
    for i in 1 .. testVentas.count loop
        dbms_output.put_line( 'id Venta: ' || testVentas(i).idVenta || ' Val venta:  ' || testVentas(i).nmValVenta  )   ; 
    end loop;  
end; 
 /   
 