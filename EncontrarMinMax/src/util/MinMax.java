package util;

public class MinMax {
	
	/**
     * Encuentra el valor mínimo en un arreglo de números enteros.
     *
     * @param array el arreglo de números enteros.
     * @return el valor mínimo en el arreglo.
     * @throws IllegalArgumentException si el arreglo es nulo o está vacío.
     */
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Encuentra el valor máximo en un arreglo de números enteros.
     *
     * @param array el arreglo de números enteros.
     * @return el valor máximo en el arreglo.
     * @throws IllegalArgumentException si el arreglo es nulo o está vacío.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
