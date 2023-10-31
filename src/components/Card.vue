<template>
  <div class="container pb-5 pt-3">
    <div class="card text-left">
      <div class="card-header" style="background-color: #930050">
        <ul class="nav nav-tabs card-header-tabs">
          <li class="nav-item">
            <span
              class="nav-link active mr-2 border-bottom border-secondary"
              style="color: black"
            >
              <h4>Editar Producto</h4>
            </span>
          </li>
        </ul>
      </div>
      <div class="card-body">
        <form class="col-12">
          <div class="row">
            <div class="col">
              <label for="nombre">Nombre</label>
              <input
                type="text"
                class="form-control"
                placeholder="Ingrese el nombre"
                required
              />
            </div>
            <div class="col">
              <label for="tipo">Tipo</label>
              <select class="form-select" style="background-color: #d7d7d7">
                <option selected>Seleccionar el tipo de producto</option>
                <option value="1">Skincare</option>
                <option value="2">Jabón</option>
                <option value="3">Cabello</option>
              </select>
            </div>
          </div>
          <div class="row">
            <div class="col mt-3">
              <label for="nombre">Formato</label>
              <input
                type="text"
                class="form-control"
                placeholder="Ingrese el formato"
                required
              />
            </div>
            <div class="col mt-3">
              <label for="nombre">Precio</label>
              <input
                type="text"
                class="form-control"
                placeholder="Ingrese el precio"
                required
              />
            </div>
          </div>
          <div class="row">
            <div class="col mt-3">
              <label for="nombre">Stock</label>
              <input
                type="number"
                value="0"
                min="1"
                class="form-control"
                placeholder="Ingrese el stock"
                required
              />
            </div>
            <div class="col mt-3">
              <label for="formFile" class="form-label">Imagen</label>
              <input class="form-control" type="file" id="formFile" required />
            </div>
          </div>
          <div class="row" style="justify-content: end">
            <div class="col mt-5">
              <button
                type="submit"
                class="btn mt-4 ml-3 btn-lg"
                style="background-color: #55012f; color: white"
              >
                Crear producto
              </button>
            </div>
            <div class="col-6 mt-3 form-floating">
              <div class="label-descripcion">
                <label for="descripcion">Descripción</label>
              </div>
              <textarea
                class="form-control"
                placeholder="Modificar la descripción..."
                id="floatingTextarea2"
                style="height: 12vh"
                required
              ></textarea>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<style scoped>
.card {
  height: 100%;
  color: rgb(0, 0, 0);
}
.card-body {
  background-color: white;
  display: flex;
}
.col input {
  background-color: #d7d7d7;
}

.col-6 input {
  background-color: #d7d7d7;
}

.col-6 textarea {
  background-color: #d7d7d7;
}
.form-select{
  color: rgba(0, 0, 0, 0.658);
}
.form-control{
  color: rgba(0, 0, 0, 0.658);
}
</style>
