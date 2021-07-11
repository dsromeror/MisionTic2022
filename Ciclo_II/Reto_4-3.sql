use redflix;
update peliculas
	set pel_año = 2012
	where pel_titulo = "Los Vengadores";
update usuarios
	set usu_celular = 3115678432
    where alias = "ninja";
delete from transmisiones where alias = "green" and titulo = "Parasitos"