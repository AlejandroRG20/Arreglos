package Ejercicio2y3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActasDeNotas {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String carnet;
        double primerP;
        double segundoP = 0;
        double sistematicos;
        double proy = 0;
        double NF = 0, NFI = 0;
        String aprobo = "", deserto = "";
        double Iconv = 0;
        double IIconv = 0;
        int desercion = 0, apro = 0, repro = 0, matriculaI = 0, matriculaE = 0, noD = 0, PA = 0;
        Scanner scan = new Scanner(System.in);
        String decicion;
        int cantidad, parcial = 0, proyecto = 0, opcion;
        System.out.println("Digite la cantidad de alumnos: ");
        cantidad = validarN();

        matriculaI = cantidad;
        matriculaE = cantidad;
        System.out.println("En este curso habra proyecto o II examen parcial? 1.proyecto  2.II parcial");
        opcion = validarN();
        switch (opcion) {
            case 1:
                proyecto = 35;
                parcial = 0;
                break;
            case 2:
                parcial = 35;
                proyecto = 0;
                break;
            default:
                System.out.println("valor no valido repitiendo aplicacion...");
                System.out.println("----------------------------------------");
                ActasDeNotas.main(args);
        }
        InformacionCurso info = new InformacionCurso("INTRODUCCION A LA PROGRAMACION", "PRIMER SEMESTRE 2021          ", "INGENIERIA DE SISTEMAS        ", "REGULAR                       ", 30849, "1M1-IS", "S1004", "1004", cantidad, 35, parcial, 30, proyecto);
        boolean repetir = true;
        System.out.println(info);
        Estudiante[] E = new Estudiante[info.getCantidadEstudiantes()];
        while (repetir == true) {
            ActasDeNotas a = new ActasDeNotas();
            for (int i = 0; i < E.length; i++) {
                System.out.println("Ingrese los datos del estudiante # " + (i + 1));
                System.out.println("ingrese el carnet:");
                carnet = scan.next();
                System.out.println("ingrese el nombre: ");
                nombre = scan.next();
                System.out.println("ingrese el apellido:");
                apellido = scan.next();
                System.out.println("ingrese la nota del primer parcial: ");
                primerP = filtroDeNotas();
                if ((proyecto == 35) && (parcial == 0)) {
                    System.out.println("ingrese la nota del proyecto: ");
                    proy = filtroDeNotas();
                } else {
                    System.out.println("ingrese la nota del segundo parcial: ");
                    segundoP = filtroDeNotas();
                }
                System.out.println("ingrese la nota de los sistematicos: ");
                sistematicos = filtroDeSis();
                NF = proy + primerP + segundoP + sistematicos;
                if (NF >= 60) {
                    System.out.println("aprobo");
                } else if (NF < 60) {
                    System.out.println("es estudiante no aprobo con el acumulado estandar...");
                    System.out.println("ingrese la nota I convocatoria max(70 pts): ");
                    Iconv = filtroIconv();
                    NFI = Iconv + sistematicos;
                    if (NFI < 60) {
                        System.out.println("el estudiante tampoco aprobo con la primer convocatoria...");
                        System.out.println("ingrese la nota II parcial");
                        IIconv = filtroIIconv();
                    }
                }
                opcion = 0;
                deserto = "";
                System.out.println("el estudiante deserto? 1.si 2.no");
                opcion = validarN();
                if (opcion == 1) {
                    deserto = "si";
                    noD++;
                    matriculaE -= 1;
                } else if (opcion == 2) {
                    deserto = "no";
                } else {
                    deserto = "-";
                }
                aprobo = "";
                if ((NF >= 60) || (NFI >= 60)||(IIconv>=60)) {
                    aprobo = "si";
                    apro++;
                } else {
                    aprobo = "no";
                    repro++;
                }
                E[i] = new Estudiante(carnet, nombre, apellido, primerP, segundoP, sistematicos, proy, NF, Iconv, NFI, IIconv, aprobo, deserto);
            }
            System.out.println("no.      carnet     nombre completo             IP       IIP    SIST     PROY     N.F      I CONV   NF.I   II CONV  APROBO? DESERTO?");
            for (int i = 0; i < E.length; i++) {
                
                System.out.println((i + 1) + " " + E[i]);
            }
            //reporte
            System.out.println("REPORTE---------------------------------------------------------------------------\n");
            System.out.println("matricula inicial: " + matriculaI + "\nmatricula efectiva: " + matriculaE + "\nno. deserciciones: " + noD + "\naprobados: " + apro + "\nreprobados: " + repro);
            //menu de opciones del ordenamiento
            boolean menu = true;
            while (menu = true) {
                System.out.println("1.ordenar");
                System.out.println("2.busqueda");
                System.out.println("3.salir");
                System.out.print("digite una opcion: ");
                opcion = validarN();
                switch (opcion) {
                    case 1:
                        System.out.println("opciones de ordenamiento: ");
                        System.out.println("1.por nota final");
                        System.out.println("2.por nota final despues de primer convocatoria");
                        System.out.println("3.por nota final despues de segunda convocatoria");
                        System.out.println("selecciones una opcion: ");
                        opcion = validarN();
                        switch (opcion) {
                            case 1:
                                ordenarNF(E);
                                break;
                            case 2:
                                ordenarNFI(E);
                                break;
                            case 3:
                                ordenarNFII(E);
                                break;
                            default:

                        }
                        break;
                    case 2:
                        System.out.println("opciones de busqueda: ");
                        System.out.println("1.por nota final");
                        System.out.println("2.por nota final despues de primer convocatoria");
                        System.out.println("3.por nota final despues de segunda convocatoria");
                        System.out.println("selecciones una opcion: ");
                        opcion = validarN();
                        switch (opcion) {
                            case 1:
                                System.out.println("busqueda por NOTA FINAL");
                                for (int i = 0; i < E.length; i++) {
                                    System.out.println((i + 1) + "-" + E[i].getNombre() + " " + E[i].getApellido() + "    " + E[i].getNF());
                                }
                                break;
                            case 2:
                                System.out.println("busqueda por NOTA FINAL DESPUES DE LA PRIMERA CONVOCATORIA");
                                for (int i = 0; i < E.length; i++) {
                                    System.out.println((i + 1) + "-" + E[i].getNombre() + " " + E[i].getApellido() + "    " + E[i].getNFI());
                                }
                                break;
                            case 3:
                                System.out.println("busqueda por NOTA FINAL DESPUES DE LA SEGUNDA CONVOCATORIA");
                                for (int i = 0; i < E.length; i++) {
                                    System.out.println((i + 1) + "-" + E[i].getNombre() + " " + E[i].getApellido() + "    " + E[i].getIIconv());
                                }
                                break;
                            default:

                        }
                        break;
                    case 3:
                        menu = false;
                        break;
                    default:
                        menu = true;
                }
            }

            //validar si repetir app
            System.out.print("\t\tdesea repetir el programa? si/no");
            decicion = scan.next();
            if (decicion.toLowerCase().equals("si")) {
                repetir = true;
            } else if (decicion.toLowerCase().equals("no")) {
                System.exit(0);
            } else {
                repetir = true;
            }
        }
    }

    public static int validarN() {
        int n = 0;
        boolean rep = true;
        Scanner scan = new Scanner(System.in);
        while (rep == true) {
            try {
                rep = false;
                n = scan.nextInt();

                if (n < 0) {
                    rep = true;
                    System.out.println("no digites un numero negativo ");
                    System.out.print("vuelve a digitar la nota: ");
                }
            } catch (InputMismatchException e) {
                rep = true;
                scan.next();
                System.out.println("debes digitar un numero no letras");
            }

        }
        return n;
    }

    public static double filtroDeNotas() {
        double nota = 0;
        boolean rep = true;
        Scanner scan = new Scanner(System.in);
        while (rep == true) {
            try {
                nota = scan.nextInt();
                if ((nota <= 35) && (nota >= 0)) {
                    rep = false;
                } else if ((nota < 0) || (nota > 35)) {
                    rep = true;
                    System.out.println("digita una nota que este en el rango(0-35) ");
                    System.out.print("vuelve a digitar la nota: ");
                }
            } catch (InputMismatchException e) {
                rep = true;
                scan.next();
                System.out.println("debes digitar un numero no letras");
            }

        }
        return nota;
    }

    public static double filtroDeSis() {
        double nota = 0;
        boolean rep = true;
        Scanner scan = new Scanner(System.in);
        while (rep == true) {

            try {
                nota = scan.nextInt();
                if ((nota <= 30) && (nota >= 0)) {
                    rep = false;
                } else if ((nota < 0) || (nota > 30)) {
                    rep = true;
                    System.out.println("digita una nota que este en el rango(0-30) ");
                    System.out.print("vuelve a digitar la nota: ");
                }
            } catch (InputMismatchException e) {
                rep = true;
                scan.next();
                System.out.println("debes digitar un numero no letras");
            }
        }
        return nota;
    }

    public static double filtroIconv() {
        double nota = 0;
        boolean rep = true;
        Scanner scan = new Scanner(System.in);
        while (rep == true) {

            try {
                nota = scan.nextInt();
                if ((nota <= 70) && (nota >= 0)) {
                    rep = false;
                } else if ((nota < 0) || (nota > 70)) {
                    rep = true;
                    System.out.println("digita una nota que este en el rango (0-70)");
                    System.out.print("vuelve a digitar la nota: ");
                }
            } catch (InputMismatchException e) {
                rep = true;
                scan.next();
                System.out.println("debes digitar un numero no letras");
            }
        }
        return nota;
    }

    public static double filtroIIconv() {
        double nota = 0;
        boolean rep = true;
        Scanner scan = new Scanner(System.in);
        while (rep == true) {

            try {
                nota = scan.nextInt();
                if ((nota <= 100) && (nota >= 0)) {
                    rep = false;
                } else if ((nota < 0) || (nota > 100)) {
                    rep = true;
                    System.out.println("digita una nota que este en el rango (0-100)");
                    System.out.print("vuelve a digitar la nota: ");
                }
            } catch (InputMismatchException e) {
                rep = true;
                scan.next();
                System.out.println("debes digitar un numero no letras");
            }
        }
        return nota;
    }

    public static void ordenarNF(Estudiante E[]) {
        Estudiante ju = new Estudiante();
        int k, l;
        for (k = 0; k < E.length - 1; k++) {
            for (l = 0; l < E.length - k - 1; l++) {
                if (E[l + 1].getNF() > E[l].getNF()) {
                    ju = E[l + 1];
                    E[l + 1] = E[l];
                    E[l] = ju;
                }
            }
        }
        System.out.println("ordenado por nota final: ");
        for (int i = 0; i < E.length; i++) {
            System.out.println((i + 1) + " " + E[i]);
        }
    }

    public static void ordenarNFI(Estudiante E[]) {
        Estudiante ju = new Estudiante();
        int k, l;
        for (k = 0; k < E.length - 1; k++) {
            for (l = 0; l < E.length - k - 1; l++) {
                if (E[l + 1].getNFI() > E[l].getNFI()) {
                    ju = E[l + 1];
                    E[l + 1] = E[l];
                    E[l] = ju;
                }
            }
        }
        System.out.println("ordenado por nota final despues de primera convocatoria: ");
        for (int i = 0; i < E.length; i++) {
            System.out.println((i + 1) + " " + E[i]);
        }
    }

    public static void ordenarNFII(Estudiante E[]) {
        Estudiante ju = new Estudiante();
        int k, l;
        for (k = 0; k < E.length - 1; k++) {
            for (l = 0; l < E.length - k - 1; l++) {
                if (E[l + 1].getIIconv() > E[l].getIIconv()) {
                    ju = E[l + 1];
                    E[l + 1] = E[l];
                    E[l] = ju;
                }
            }
        }
        System.out.println("ordenado por nota final despues de segunda convocatoria: ");
        for (int i = 0; i < E.length; i++) {
            System.out.println((i + 1) + " " + E[i]);
        }
    }
}
