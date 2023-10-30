<script setup>
    
</script>

<template>
  <div class="col">
    <label for="nombre">{{ nombreLabel }}</label>
    <input
      type="text"
      class="form-control"
      placeholder="nombrePlaceholder"
      required
    />
  </div>
</template>

<style scoped>
@import url("https://fonts.cdnfonts.com/css/kufam-2");

body{
  background-color: #640238;
}

main {
  background-color: #640238;
  color: white;
  font-family: kufam;
}
.container {
  padding-top: 22vh;
}
.container h1 {
  text-align: center;
}
</style>