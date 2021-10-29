package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.model.Gama;
import com.usa.app.g24.rentas.dto.GamaRequest;
import com.usa.app.g24.rentas.repository.GamaRepository;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author 57315
 */
@RunWith(MockitoJUnitRunner.class)
public class GamaServiceTest {
    
    @Mock
    private GamaRepository repository;
    
    /**
     * Gama Service
     */
    @InjectMocks
    private GamaService gamaService;
    
    /**
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void guardarCuandoNombreExiste() throws Exception {
        GamaRequest request = new GamaRequest();
        request.setName("Sedan");
        request.setDescription("Ultra lujo");
        
        Mockito.when(repository.findByName(request.getName()))
                .thenReturn(new Gama());
        
        gamaService.guardar(request);
    }
    
    /**
     *
     * @throws Exception
     */
    @Test
    public void guardarGama() throws Exception {
        GamaRequest request = new GamaRequest();
        request.setName("Sedan");
        request.setDescription("Ultra lujo");
        
        gamaService.guardar(request);
        
        Mockito.verify(repository, Mockito.times(1))
                .save(Mockito.any(Gama.class));
    }
    
}
