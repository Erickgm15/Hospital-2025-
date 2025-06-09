package data;

public class Pacientes {
    String[] columnas = {"ID", "Nombre", "Edad"};
    Object[][] datos = {
            {1, "Ana", 20}, {2, "Luis", 22}, {3, "María", 19}, {4, "Carlos", 21}, {5, "Lucía", 23},
            {6, "Pedro", 20}, {7, "Sofía", 22}, {8, "Jorge", 18}, {9, "Valeria", 24}, {10, "Andrés", 19},
            {11, "Marta", 20}, {12, "Ricardo", 21}, {13, "Elena", 22}, {14, "Diego", 23}, {15, "Julia", 20},
            {16, "Fernando", 21}, {17, "Isabel", 22}, {18, "Tomás", 19}, {19, "Laura", 24}, {20, "Alberto", 23},
            {21, "Claudia", 20}, {22, "Ramón", 21}, {23, "Diana", 22}, {24, "Héctor", 23}, {25, "Carla", 24},
            {26, "Gabriel", 19}, {27, "Natalia", 20}, {28, "Óscar", 21}, {29, "Rocío", 22}, {30, "Emilio", 23},
            {31, "Andrea", 19}, {32, "Sergio", 20}, {33, "Patricia", 21}, {34, "Iván", 22}, {35, "Paula", 23},
            {36, "Gustavo", 24}, {37, "Angela", 19}, {38, "Manuel", 20}, {39, "Carmen", 21}, {40, "Julio", 22},
            {41, "Verónica", 23}, {42, "Raúl", 20}, {43, "Susana", 21}, {44, "Mateo", 22}, {45, "Teresa", 19},
            {46, "Fabián", 23}, {47, "Lorena", 24}, {48, "Adrián", 21}, {49, "Esther", 22}, {50, "Bruno", 20}
    };

    public Object[][] getDatos() {
        return datos;
    }
}