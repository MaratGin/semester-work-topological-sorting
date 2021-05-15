package com.company.Others;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class AdjMatrix {


    public static void main(String[] args) throws Exception {
    /*





ВАЖНО!!! ПОМЕНЯТЬ ПУТЬ ДЛЯ СВОЕЙ ОС!!
ВАЖНО!!! ПОМЕНЯТЬ ПУТЬ ДЛЯ СВОЕЙ ОС!!
ВАЖНО!!! ПОМЕНЯТЬ ПУТЬ ДЛЯ СВОЕЙ ОС!!







*/

//String[] name={"/insert","/search","/split","/merge","/erase"};
//String path="/Users/user/CLionProjects/semester-work-cartesian-treeh/dataset/data";
// path=path+"/data";

        String[] name={"/pack1","/pack2","/pack3","/pack4","/pack5","/pack6","/pack7","/pack8","/pack9","/pack10"};
        int[] packs={40,100,200,400,800,1600,2800,4000,4800,6000,9000};
        String[] name2={"/01.csv","/02.csv","/03.csv","/04.csv","/05.csv","/06.csv","/07.csv",
                "/08.csv","/09.csv","/10.csv","/11.csv"};
        String path="H:\\Загрузки\\Matrix";


        path=path+"\\data";

        File file= new File(path);
        file.mkdir();


        int h=0;


        for (int i = 0; i <name.length; i++) {
            File dir1 = new File(path+name[i]);
            dir1.mkdir();
            for (int j = 0; j <packs.length ; j++) {
                pack1(dir1.getAbsolutePath(), packs[j],name2[j]);

            }



        }



            // 100
             //500
            //5000
            //10 000
            // 25 000
            //50 000
            //100 000
            //250 000
            //500 000
            //750 000
            //1 000 000
            // 2 500 000
            //5 000 000

//            File dir1= new File(path+name[i]);
//            dir1.mkdir();
//            String path2= dir1.getAbsolutePath();
//            for (int j = 0; j < name2.length ; j++) {
//                File dir2= new File(path2+name2[j]);
//                System.out.println(dir2.getAbsolutePath());
//                dir2.mkdir();





    }

    static void pack1(String path, int n, String pack) throws IOException {

        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                if (k == 1) {
                    boolMatrix[i][j] = 1;
                    boolMatrix[j][i] = 2;

                }
            }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack2(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack3(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack4(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack5(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack6(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack7(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack8(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack9(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack10(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack11(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack12(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }
    static void pack13(String path, int n, String pack) throws IOException {
        File file= new File(path+pack);
        // File file= new File(path+"/01.csv");
        file.createNewFile();
        int  [] [] boolMatrix= new int[n][n];



        Random random= new Random();


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (boolMatrix[i][j] != 1 && boolMatrix[i][j] != 2 && i!=j) {
                    int k = random.nextInt(2);
                    if (k == 1) {
                        boolMatrix[i][j] = 1;
                        boolMatrix[j][i] = 2;

                    }
                }

            }
        }

        FileWriter writer= new FileWriter(file);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {


                writer.write((int) boolMatrix[i][j] + ",");
            }
        }
        writer.flush();
        writer.close();



    }

}
