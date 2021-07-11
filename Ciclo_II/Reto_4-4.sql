use redflix;
Select 'Consulta 1';
Select * from transmisiones;
Select 'Consulta 2';
Select pel_titulo,pel_resumen,pel_año from peliculas where pel_año>2000 order by pel_titulo;
Select 'Consulta 3';
select pel_titulo from peliculas join director using (dir_id) where dir_id = 105;
Select 'Consulta 4';
select titulo from transmisiones where alias = "lucky";
Select 'Consulta 5';
Select alias,usu_nombre,usu_apellido from transmisiones join usuarios using(alias) where titulo = "Interestelar";
Select 'Consulta 6';
Select count(distinct pel_titulo) from peliculas where pel_año>2000;