package br.com.alura.loja.testes;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;

public class TestedeEstados {

    public void testar(){

        /*estado de transient onde a JPA não está gerenciando*/
        Categoria celulares = new Categoria("CELULARES");

        EntityManager em = JPAUtil.getEntityManager();

        em.getTransaction().begin();

        /*altera o estado para managed quando a JPA começa a olhar para a entidade */
        em.persist(celulares);

        /*atualiza*/
        celulares.setNome("teste");

        /*sincroniza com o banco de dados*/
        em.flush();

        /*altera o estado para detached*/
        em.clear();

        /*volta para o estado managed*/
        celulares = em.merge(celulares);

        /*atualiza a entidade*/
        celulares.setNome("123");

        /*sincroniza com o banco de dados*/
        em.flush();

        /*remove a entidade*/
        em.remove(celulares);

        /* sincroniza com o banco de daos
        * */
        em.flush();


        em.getTransaction().commit();
        em.close();
    }
}
