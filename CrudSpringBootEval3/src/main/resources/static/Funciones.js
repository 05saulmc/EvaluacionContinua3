function eliminarCategorias(id){
swal({
  title: "Estas seguro de Eliminar?",
  text: "Once deleted, you will not be able to recover this imaginary file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	  $.ajax({
		  url:"/eliminarCategorias/"+id,
		  success: function(res){
			  console.log(res);
		  }
	  });
    swal("Poof! Your imaginary file has been deleted!", {
      icon: "success",
    }).then((ok)=>{
    	if(ok){
    		location.href="/listaCategorias";
    	}
    });
  } else {
    swal("Your imaginary file is safe!");
  }
});
}



function eliminarProductos(id){
	swal({
	  title: "Estas seguro de Eliminar?",
	  text: "Once deleted, you will not be able to recover this imaginary file!",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
		  $.ajax({
			  url:"/eliminarProductos/"+id,
			  success: function(res){
				  console.log(res);
			  }
		  });
	    swal("Poof! Your imaginary file has been deleted!", {
	      icon: "success",
	    }).then((ok)=>{
	    	if(ok){
	    		location.href="/listaProductos";
	    	}
	    });
	  } else {
	    swal("Your imaginary file is safe!");
	  }
	});
	}

