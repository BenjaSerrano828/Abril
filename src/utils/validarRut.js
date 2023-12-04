export function validarRut(rut) {
    if (!/^[0-9]+[-]{0,1}[0-9kK]{1}$/.test(rut)) {
        return false; // El formato no es válido
    }

    rut = rut.replace(/[.-]/g, ''); // Eliminar puntos y guión

    let dv = rut.slice(-1).toUpperCase();
    let rutSinDv = rut.slice(0, -1);
    let suma = 0;
    let multiplo = 2;

    for (let i = rutSinDv.length - 1; i >= 0; i--) {
        suma += parseInt(rutSinDv.charAt(i)) * multiplo;
        multiplo = multiplo === 7 ? 2 : multiplo + 1;
    }

    let resultado = (11 - (suma % 11)).toString().toUpperCase();

    if (resultado === dv) {
        return true; // RUT válido
    }

    if (resultado === 'K' && dv === 'K') {
        return true; // RUT válido con K
    }

    return false; // RUT inválido
}