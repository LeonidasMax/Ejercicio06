package Lista;

import java.util.*;

public class ClsArrayList {
    public void ejemplo1() {
//        List<integer> numeros=new ArrayList<>();
//            numeros.add(500);
//            numeros.add(1000);
//            numeros.add(1500);
//            numeros.add(2000);
//            numeros.add(2500);
//            int total = 0;
//            for(int n : numero){
//                total = total + n;
//            }
//        System.out.println("sumatoria: "+total);
//            System.out.println(numeros);


//        String primerTarea = taskList.get(0);
//        System.out.println("Primer: "+primerTarea );

//        List<String> taskList = new ArrayList<String>();
//        String lectura = "ira a votar";
//        taskList.add(lectura);
//        taskList.add("Hacer compras");
//        taskList.add("sacar al perro");
//        taskList.add("hace la cama");
//        taskList.add("lavar el carro");
//        System.out.println(taskList);
//        String primerTarea = taskList.get(0);
//        System.out.println("Primer: "+primerTarea );
//        //Remover item
//        taskList.remove(0);
//        String primerTarea = taskList.get(0);
//        System.out.println("Primer: "+primerTarea );
//            }
        //Esto es una iteración, recorre todos los elementos y a la vez agrega "Tarea:"
        int elementos=1;
//        for (String tarea : taskList) {
//            System.out.println(elementos+" Tarea: " + tarea);
//            elementos++;

            int tarea_numero=0;
            for ( : taskList) {
                System.out.println(elementos+" Tarea: " + tarea);
                elementos++;
//            Tarea: Hacer compras
//            Tarea: sacar al perro
//            Tarea: hace la cama
//            Tarea: lavar el carro
        }
    }}



public void listaValores(){}

public void listaTareas(){
    List<ClsTaskList> task=new ArrayList<>();
    ClsArrayList tareaIndividual = new ClsArrayList();
    tareaIndividual.setTaskName("Hacer compras");
    tareaIndividual.setTaskDescription("ir a la torre");
    tareaIndividual.setDone(false);
    task.add(tareaIndividual);
    tareaIndividual=new clsTaskList();

    tareaIndividual.setTaskName("Sacar al perro");
    tareaIndividual.setTaskDescription("llevarlo al parque");
    tareaIndividual.setDone(false);
    task.add(tareaIndividual);
    tareaIndividual=new clsTaskList();

    tareaIndividual.setTaskName("Hacer la cama");
    tareaIndividual.setTaskDescription("si no lo hago me regañan");
    tareaIndividual.setDone(false);
    task.add(tareaIndividual);
    tareaIndividual=new clsTaskList();

    tareaIndividual.setTaskName("Ir a votar");
    tareaIndividual.setTaskDescription("cumplir con mi pais");
    tareaIndividual.setDone(false);
    task.add(tareaIndividual);
    tareaIndividual=new clsTaskList();

    task.get(1).setDone(true);

    for(ClsTaskList tl:task){
        if (!tl.isDone())
            System.out.println(tarea_numero+"Tarea:"+tl.getTraskname()+"Desc: "+tl.getTaskDescription());

            System.out.println("Tarea: "+tl.getTraskname()+tl.getTaskDescription());
        tarea_numero++;

    }

}}