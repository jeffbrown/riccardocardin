package riccardocardin

class Library {

    private final MathService mathService

    Library(MathService mathService) {
        this.mathService = mathService
    }
    int add(int i, int j) {
       int result = mathService.add i, j
        println result
        result
    }
}
