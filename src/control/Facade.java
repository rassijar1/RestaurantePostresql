/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import modelo.DAO.*;
import modelo.DTO.*;
import vista.*;
import vista.CajasMensaje;
/**
 *
 * @author User
 */
public class Facade implements ActionListener{
    
    principal formularioPrincipal;
    Login_clien loginCliente;
    login_administrador login_Administrador;
    login_encarga login_encargado;
    form_registro_cliente registrar_cliente;
    Registro_Adim reg_admin;
    Form_Plato f_plato;
    Form_Receta f_receta;
    contruccion_de_platos construcicion;
    form_admin_encargado admin_Encar;
    form_registro_cliente regcli;
    Fomr_ingredietne f_ingrediente;
    form_admin_encargado form_admin_enc;
    CajasMensaje a;
    Menu menu;
    ventas ventas;
    form_Carta fcarta;
    ArrayList<Plato>platos;
    int pedido;
    public Facade(){
    
//formularios 
    pedido=2;
    this.platos=new ArrayList<Plato>();
    this.fcarta=new form_Carta();
    this.ventas=new ventas();
    this.menu=new Menu();
    this.reg_admin=new Registro_Adim();
    this.formularioPrincipal=new principal();
    this.loginCliente=new Login_clien();
    this.login_Administrador=new login_administrador();
    this.login_encargado=new login_encarga();
    this.registrar_cliente=new form_registro_cliente();
    this.f_ingrediente=new Fomr_ingredietne();
    this.reg_admin=new Registro_Adim();
    this.form_admin_enc=new form_admin_encargado();
    this.construcicion=new contruccion_de_platos();
    this.f_plato=new Form_Plato();
    this.f_receta=new Form_Receta();
//aciones//
//menu//
    menu.getBtn_agregarplato().addActionListener(this);
    menu.getBtn_Cerrar().addActionListener(this);
    menu.getBtn_comprar().addActionListener(this);
//principal
    formularioPrincipal.getBtn_cliente().addActionListener(this);;
    formularioPrincipal.getBtn_encargado().addActionListener(this);
    formularioPrincipal.getBtn_admin().addActionListener(this);
    formularioPrincipal.getBtn_salir().addActionListener(this);
//administrador
    reg_admin.getBtn_reg().addActionListener(this);
    login_Administrador.getBtn_Reg().addActionListener(this);
    login_Administrador.getBtn_cerrar().addActionListener(this);
    login_Administrador.getBnt_ingresar_admin().addActionListener(this);
    reg_admin.getBtn_cerrar().addActionListener(this);
//encargado
    login_encargado.getBtn_cerrrar().addActionListener(this);
    login_encargado.getBoton_ingreso_encargado().addActionListener(this);
//cliente
    loginCliente.getBtningresocl().addActionListener(this);
    loginCliente.getBtnregistrocliente().addActionListener(this);
    loginCliente.getBtn_cerrar().addActionListener(this);
    registrar_cliente.getBtn_cerrar().addActionListener(this);
    registrar_cliente.getBntregistrarcli().addActionListener(this);
//ingrediente
    f_receta.getBtn_cerrar().addActionListener(this);
    f_receta.getBtn_receta().addActionListener(this);
    f_plato.getBtn_cerrar().addActionListener(this);
    f_plato.getBtn_registrar().addActionListener(this);
    f_ingrediente.getBtn_cerrar().addActionListener(this);
    f_ingrediente.getBtn_ing().addActionListener(this);
//admin_encargado
    form_admin_enc.getBtn_cerrar().addActionListener(this);
    form_admin_enc.getBtn_regitraren().addActionListener(this);
    form_admin_enc.getBtn_ventas().addActionListener(this);
//construccion
    construcicion.getBtn_agregar_ing().addActionListener(this);
    construcicion.getBtn_receta().addActionListener(this);
    construcicion.getBtn_crearplato().addActionListener(this);
    construcicion.getBtn_Cerrar().addActionListener(this);
    construcicion.getBtn_crear_carta().addActionListener(this);
//ventas
    ventas.getBtn_cerrar().addActionListener(this);
    ventas.getBtn_ver().addActionListener(this);
//carta
    fcarta.getBtn_crear().addActionListener(this);
    fcarta.getCerrar().addActionListener(this);
}
    
    public List<Administrador> AgregarAdministrador(){
        AdministradorDAO dao = new AdministradorDAO();       
        return dao.getAdministrador();
    
    }
    public void EliminarAdministrador(Administrador elim){
    AdministradorDAO dao= new AdministradorDAO();
    if(elim!=null){
        
    if(dao.delete(elim)){
    System.out.println("ELIMINADO");
    }else{
    System.out.println("NO ELIMINADO");
    }
    }
    }
    public void CrearAdministrador(Administrador nuevo){
    AdministradorDAO dao= new AdministradorDAO();
    if(nuevo!=null){
        
    if(dao.create(nuevo)){
    System.out.println("Administrador CREADO");
    }else{
    System.out.println("ERROR");
    }
    }
    }
     public void CrearEncargado(Encargado nuevo){
    EncargadoDAO dao= new EncargadoDAO();
    if(nuevo!=null){
        
    if(dao.create(nuevo)){
    System.out.println("Encargado CREADO");
    }else{
    System.out.println("ERROR");
    }
    }
    }
     public void CrearCarta(Carta nuevo) {
      CartaDAO dao= new CartaDAO();
    if(nuevo!=null){
    if(dao.create(nuevo)){
    System.out.println("Carta CREADO");
    }else{
    System.out.println("ERROR");
    }
    }  
    }
     
     public void CrearIngrediente(Ingrediente nuevo){
    IngredienteDAO dao= new IngredienteDAO();
    if(nuevo!=null){
        
    if(dao.create(nuevo)){
    System.out.println("Ingrediente CREADO");
    }else{
    System.out.println("ERROR");
    }
    }
    }
    public void CrearReceta(Receta nuevo){
    RecetaDAO dao= new RecetaDAO();
    if(nuevo!=null){
        
    if(dao.create(nuevo)){
    System.out.println("Receta CREADA");
    }else{
    System.out.println("ERROR");
    }
    }
    }
    public void CrearPlato(Plato nuevo){
          PlatoDAO dao= new PlatoDAO();
    if(nuevo!=null){
        
    if(dao.create(nuevo)){
    System.out.println("Plato CREADO");
    }else{
    System.out.println("ERROR");
    }
    }
    }
    public void CrearPedido(Pedido nuevo){
          PedidoDAO dao= new PedidoDAO();
    if(nuevo!=null){
        
    if(dao.create(nuevo)){
    System.out.println("Pedido CREADO");
    }else{
    System.out.println("ERROR");
    }
    }
    }
    public void CrearCliente(Cliente nuevo){
    ClienteDAO dao= new ClienteDAO();
    if(nuevo!=null){
    if(dao.create(nuevo)){
    System.out.println("Cliente CREADO");
    }else{
    System.out.println("ERROR");
    } 
    }
    }
     public void Crearp_p(plato_pedido nuevo){
    Plato_pedidoDAO dao= new Plato_pedidoDAO();
    if(nuevo!=null){
    if(dao.create(nuevo)){
    System.out.println("Cliente CREADO");
    }else{
    System.out.println("ERROR");
    } 
    }
    }
    public void login(Administrador nuevo){
        
    }
    public void Actualizar(Administrador act){
    
        AdministradorDAO dao= new AdministradorDAO();
        if(dao.update(act)){
        System.out.println("Administrador MODIFICADO");
        }else{
            System.out.println("ERROR");
        }
        
    }
     public void iniciar() {
        formularioPrincipal.setTitle("Restaurante");
        formularioPrincipal.setVisible(true);
                
    }
     
    public String recorrerCarta(){
        String a="";
           CartaDAO objC= new CartaDAO();
           List<Carta>listaC;
           listaC=objC.getCarta();
        for(int i =0; i< listaC.size();i++){
            a=a+listaC.get(i).getID()+"."+listaC.get(i).getVigencia()+"\n";
        }
        System.out.println(a+" gay");
        return a;
    }  
        public String recorrerPlato(){
        String a="";
           PlatoDAO objC= new PlatoDAO();
           List<Plato>listaC;
           listaC=objC.getPlato();
        for(int i =0; i< listaC.size();i++){
            a=a+listaC.get(i).getID()+"."+listaC.get(i).getNombre()+"."+listaC.get(i).getPrecio()+"."+"Carta: "+listaC.get(i).getId_Carta_FK()+"\n";
        }
        System.out.println(a+"Plato encontrado");
        return a;
    }  
    public  void cambiarvendido(Plato a){
        PlatoDAO objp=new PlatoDAO();
        objp.update(a);
    }
        public String recorrerReceta(){
        String a="";
           RecetaDAO objC= new RecetaDAO();
           List<Receta>listaC;
           listaC=objC.getReceta();
        for(int i =0; i< listaC.size();i++){
            a=a+listaC.get(i).getId_receta()+listaC.get(i).getDescripccion()+"\n";
        }
        return a;
    }  
    //DAOS

   public List<Administrador> ObtenerAdministrador(){
        AdministradorDAO dao = new AdministradorDAO();
        return dao.getAdministrador();
    
    }
    @Override
    public void actionPerformed(ActionEvent accion) {
    if (formularioPrincipal.getBtn_salir()== accion.getSource()) {
            formularioPrincipal.setVisible(false);            
        }
    if (form_admin_enc.getBtn_cerrar()== accion.getSource()) {
            form_admin_enc.setVisible(false);            
        }
    //ventas
    if (form_admin_enc.getBtn_ventas()== accion.getSource()){
            ventas.setVisible(true);
    } 
    if(ventas.getBtn_cerrar()==accion.getSource()){
             ventas.setVisible(false);
    }
    //encargado
     if (formularioPrincipal.getBtn_encargado()== accion.getSource()){
         login_encargado.setVisible(true);
     }
      if (login_encargado.getBtn_cerrrar()== accion.getSource()){
         login_encargado.setVisible(false);
     }
     //ingrediente
    if (construcicion.getBtn_agregar_ing()== accion.getSource()) {
            f_ingrediente.setVisible(true);            
        }
    if (f_ingrediente.getBtn_cerrar()== accion.getSource()) {
            f_ingrediente.setVisible(false);            
        }
    if (construcicion.getBtn_Cerrar()== accion.getSource()){
         construcicion.setVisible(false);
     }
    if (construcicion.getBtn_crearplato()== accion.getSource()) {
        JTextArea ta = new JTextArea();
    JTextArea ta2 = new JTextArea();
String gay = recorrerCarta();
        String gay2 = recorrerReceta();
        ta.append(gay);
        ta2.append(gay2);
        System.out.println(gay+ "GAYYYYYYY");
            
            f_plato.setVisible(true); 
            f_plato.getTxt_area_receta().append(gay);
            f_plato.getTxtarea_carta().append(gay2);
            
            
            
           
        
        }
    
     if (f_plato.getBtn_cerrar()== accion.getSource()) {
            f_plato.setVisible(false);            
        }
    if (construcicion.getBtn_receta()== accion.getSource()) {
            f_receta.setVisible(true);            
        }
      if (f_receta.getBtn_cerrar()== accion.getSource()) {
            f_receta.setVisible(false);            
        }
    //cliente
     if (formularioPrincipal.getBtn_cliente()== accion.getSource()) {
            loginCliente.setVisible(true);            
        }
    if (loginCliente.getBtn_cerrar()== accion.getSource()) {
            loginCliente.setVisible(false);            
        }
    if (loginCliente.getBtnregistrocliente()== accion.getSource()) {
            registrar_cliente.setVisible(true);            
        }
    if (registrar_cliente.getBtn_cerrar()== accion.getSource()) {
            registrar_cliente.setVisible(false);            
        }
    if(menu.getBtn_Cerrar()==accion.getSource()){
             menu.setVisible(false);
    }
    //registrar ingrediente
    if(f_ingrediente.getBtn_ing()==accion.getSource()){
        Ingrediente objI= new Ingrediente();
        objI.setId_ingrediente(Integer.parseInt(f_ingrediente.getTxt_id().getText()));
        objI.setNombre(f_ingrediente.getTxt_nom().getText());
        objI.setMedida((f_ingrediente.getTxt_med().getText()));
        objI.setCantidad(Integer.parseInt(f_ingrediente.getTxt_cant().getText()));
        CrearIngrediente(objI);
        JOptionPane.showMessageDialog(null, "Nuevo Ingrediente Registrado");
    }
    //pedido
    if(menu.getBtn_agregarplato()==accion.getSource()){
        Plato objP2= new Plato();
        objP2.setID(Integer.parseInt(menu.getTxt_IDplato().getText()));
        platos.add(objP2);
        JOptionPane.showMessageDialog(null, "Plato asignado al pedido");
        JOptionPane.showMessageDialog(null, "No olvide ingresar la fecha como: 0000-00-00");
    }
    if(menu.getBtn_comprar()==accion.getSource()){
       Pedido objPe=new Pedido();
       plato_pedido objp_p=new plato_pedido();
       objPe.setID_Pedido(pedido);
       objPe.setFecha_pedido(menu.getTxt_fecha().getText());
        CrearPedido(objPe);
       JOptionPane.showMessageDialog(null, "Nuevo Pedido Registrado");
       for(int i=0;i<=platos.size();i++){
           objp_p.setId_pedido(pedido);
           objp_p.setId_plato(platos.get(i).getID());
           cambiarvendido(platos.get(i));
           Crearp_p(objp_p);
       }
       pedido++;
    }
    //registrar plato 
     if(f_plato.getBtn_registrar()==accion.getSource()){
        Plato objP= new Plato();
        objP.setID(Integer.parseInt(f_plato.getTxt_id().getText()));
        objP.setNombre(f_plato.getTxt_nombre().getText());
        objP.setFoto((f_plato.getTxt_foto().getText()));
        objP.setDescripcion(f_plato.getTxt_des().getText());
        objP.setPrecio(Integer.parseInt(f_plato.getTxt_precio().getText()));
        String opcion = f_plato.getComb_compl().getSelectedItem().toString();
        if(opcion.equals("Facil")){
        objP.setId_complejidad_FK(1);
        }else if(opcion.equals("Medio")){
        objP.setId_complejidad_FK(2);
        }else if(opcion.equals("Dificil")){
        objP.setId_complejidad_FK(3);
        }
        String opcion2 = f_plato.getCom_cat().getSelectedItem().toString();
        if(opcion2.equals("Desayuno")){
        objP.setId_categoria_FK(1);
        }else if(opcion2.equals("Almuerzo")){
        objP.setId_categoria_FK(2);
        }else if(opcion2.equals("Cena")){
        objP.setId_categoria_FK(3);
        }
         String opcion3 = f_plato.getComb_reg().getSelectedItem().toString();
          if(opcion3.equals("Andina")){
        objP.setId_region_FK(1);
      }else if(opcion3.equals("Llanos")){
       objP.setId_region_FK(2);
       }else if(opcion3.equals("Caribe")){
       objP.setId_region_FK(3);
      }else if(opcion3.equals("Pacífica")){
      objP.setId_region_FK(4);
      }
      else if(opcion3.equals("Amazonía")){
      objP.setId_region_FK(5);
      }
        objP.setId_receta_FK(Integer.parseInt(f_plato.getTxt_receta().getText()));
        objP.setId_Carta_FK(Integer.parseInt(f_plato.getTxt_carta().getText()));
         CrearPlato(objP);
        JOptionPane.showMessageDialog(null, "Nuevo Plato Registrado");
    }
     /// Boton Consultar
     /*if(f_plato.getBtnConsultar() ==accion.getSource()){
    JTextArea ta = new JTextArea();
    
        String gay = recorrerCarta();
        ta.append(gay);
        System.out.println(gay+ "GAYYYYYYY");
            f_plato.getTxt_area_receta().append(gay);
     
            
    }*/
     //////////////////////////////////////
    //registrar receta
     if(f_receta.getBtn_receta()==accion.getSource()){
        Receta objR= new Receta();
        objR.setId_receta(Integer.parseInt(f_receta.getTxt_id_receta().getText()));
        objR.setDescripccion(f_receta.getTxt_desc_receta().getText());
         CrearReceta(objR);
        JOptionPane.showMessageDialog(null, "Nueva Receta Registrada");
    }
    //registrar cliente
    if(registrar_cliente.getBntregistrarcli()==accion.getSource()){
        Cliente objC= new Cliente();
        objC.setID_cliente(Integer.parseInt(registrar_cliente.getTxtidregcli().getText()));
        objC.setNombre(registrar_cliente.getTxtnombregcli().getText());
        CrearCliente(objC);
        JOptionPane.showMessageDialog(null, "Cliente Registrado");
    }
    //login cliente
    if (loginCliente.getBtningresocl()== accion.getSource()) {
        Cliente objA2=new Cliente(); 
        Cliente objA3=null;
        ClienteDAO objADAO=new ClienteDAO();
        objA2.setID_cliente(Integer.parseInt(loginCliente.getTxtidcl().getText()));
        objA2.setNombre(loginCliente.getTxtnombre().getText());
        objA3=objADAO.login(objA2);
        if(objA3!=null){
        JOptionPane.showMessageDialog(null, "Cliente logueado");
         JTextArea ta = new JTextArea();
        String gay = recorrerPlato();
        ta.append(gay);
        System.out.println(gay+ " carta encontrada");
            
            menu.setVisible(true); 
            menu.getTxtarea_plato().append(gay);
     }else    
         JOptionPane.showMessageDialog(null, "Cliente no existe, Por favor intentelo de nuevo"); 
    }
    //registrar carta
    if(construcicion.getBtn_crear_carta()==accion.getSource()){
       JOptionPane.showMessageDialog(null, "Para ingresar la fecha use el siguiente formato 0000-00-00");
       fcarta.setVisible(true);
    }
    if(fcarta.getCerrar()==accion.getSource()){
       fcarta.setVisible(false);
    }
// registrar carta
    if(fcarta.getBtn_crear()==accion.getSource()){
        Carta objCa=new Carta();
        CartaDAO cartadao=new CartaDAO();
        objCa.setID(Integer.parseInt(fcarta.getTxt_id().getText()));
        objCa.setVigencia((fcarta.getTxt_vig().getText()));
        objCa.setID_encargado(1);
        CrearCarta(objCa);
        JOptionPane.showMessageDialog(null, "Carta registrada");
        
    }
     //administrador
     if (formularioPrincipal.getBtn_admin()== accion.getSource()){
         login_Administrador.setVisible(true);
     }
     if (login_Administrador.getBtn_cerrar()== accion.getSource()) {
            login_Administrador.setVisible(false);            
        }
    if (login_Administrador.getBtn_Reg()== accion.getSource()) {
            reg_admin.setVisible(true);            
        }
    //registrar admin
    if (reg_admin.getBtn_cerrar()== accion.getSource()) {
            reg_admin.setVisible(false);            
        }
   if (reg_admin.getBtn_reg()== accion.getSource()) { 
       
        Administrador objA= new Administrador();
        objA.setID(Integer.parseInt(reg_admin.getTxt_id().getText()));
        objA.setNombre(reg_admin.getTxt_nom().getText());
        CrearAdministrador(objA);
        JOptionPane.showMessageDialog(null, "Administrador Registrado");
        }
   if (login_Administrador.getBnt_ingresar_admin()== accion.getSource()) {
        Administrador objA2=new Administrador(); 
        Administrador objA3=new Administrador();
        AdministradorDAO objADAO=new AdministradorDAO();
        objA2.setID(Integer.parseInt(login_Administrador.getTxt_id_admin().getText()));
        objA2.setNombre(login_Administrador.getTxt_nombre_admin().getText());
        objA3=objADAO.login(objA2);
        if(objA3!=null){
        JOptionPane.showMessageDialog(null, "Administrado logueado");
        form_admin_enc.setVisible(true);}     
        else
         JOptionPane.showMessageDialog(null, "Administrador no existe, Por favor intentelo de nuevo"); 
        }
   //login admin
    if (login_encargado.getBoton_ingreso_encargado()== accion.getSource()) {
        Encargado objA2=new Encargado(); 
        Encargado  objA3=new Encargado ();
        EncargadoDAO objADAO= new EncargadoDAO();
        objA2.setID(Integer.parseInt(login_encargado.getTxt_id_encargado().getText()));
        objA2.setNombre(login_encargado.getTxt_nombre_encargado().getText());
        objA2.setID_region(Integer.parseInt(login_encargado.getTxt_region().getText()));
        objA3=objADAO.login(objA2);
        if(objA3!=null){
        JOptionPane.showMessageDialog(null, "Encargado logueado"); 
        construcicion.setVisible(true);
        }else
         JOptionPane.showMessageDialog(null, "Encargado no existe, Por favor intentelo de nuevo"); 
        }
   if(form_admin_enc.getBtn_regitraren()==accion.getSource()){
        Encargado objE= new Encargado();
        objE.setID(Integer.parseInt(form_admin_enc.getTxt_id_encargado().getText()));
        objE.setNombre(form_admin_enc.getTxt_nombre_encargado().getText());
        String opcion = form_admin_enc.getCombox_region().getSelectedItem().toString();
        if(opcion.equals("Andina")){
        objE.setID_region(1);
      }else if(opcion.equals("Llanos")){
       objE.setID_region(2);
       }else if(opcion.equals("Caribe")){
       objE.setID_region(3);
      }else if(opcion.equals("Pacífica")){
      objE.setID_region(4);
      }
      else if(opcion.equals("Amazonía")){
      objE.setID_region(5);
      }
        objE.setID_administrador(1);
        
        CrearEncargado(objE);
        JOptionPane.showMessageDialog(null, "Encargado Registrado, Si usted lo requiere puede registrar otro");
    }

    }
   
    } 

