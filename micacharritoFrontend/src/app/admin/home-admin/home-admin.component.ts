import { Component, OnInit } from '@angular/core';
import { NavegacionComponent } from '../../Compartidos/navegacion/navegacion.component';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-home-admin',
  standalone: true,
  imports: [NavegacionComponent,CommonModule,FormsModule],
  templateUrl: './home-admin.component.html',
  styleUrl: './home-admin.component.css'
})
export class HomeAdminComponent  {

 // 🔐 Para la sección de entrega de vehículos
  placaBusqueda: string = '';

  // 🔐 Para la sección de finalizar alquiler
  numeroAlquiler: string = '';

  // 🚗 Para seleccionar tipo de vehículo y filtrar disponibles
  tipoSeleccionado: string = '';
  tiposVehiculo: string[] = ['automovil', 'camioneta', 'campero', 'microbus', 'motocicleta'];
  vehiculosDisponibles: any[] = [];

  constructor() {}

  // 🔍 Filtra vehículos disponibles (datos simulados)
  filtrarPorTipo() {
    // En el futuro esto se hará con un servicio
    this.vehiculosDisponibles = [
      { tipo: this.tipoSeleccionado, placa: 'ABC123', color: 'Rojo' },
      { tipo: this.tipoSeleccionado, placa: 'XYZ789', color: 'Azul' }
    ];
  }

  // 🚚 Marcar vehículo como entregado (simulado)
  marcarComoEntregado() {
    console.log('Entregado:', this.placaBusqueda);
    // Aquí se llamaría al servicio para cambiar estado a "entregado"
  }

  // 🏁 Finalizar alquiler (simulado)
  finalizarAlquiler() {
    console.log('Finalizar alquiler:', this.numeroAlquiler);
    // Aquí se llamaría al servicio para marcar como "disponible"
  }
  alquileresPendientes: any[] = [
  {
    numero: 1,
    usuario: 'Juan Pérez',
    placa: 'ABC123',
    tipo: 'automovil',
    color: 'Rojo',
    fechaInicio: '2025-06-10',
    fechaFin: '2025-06-12',
    estado: 'pendiente de entrega'
  },
  {
    numero: 2,
    usuario: 'Ana Gómez',
    placa: 'XYZ789',
    tipo: 'camioneta',
    color: 'Negra',
    fechaInicio: '2025-06-11',
    fechaFin: '2025-06-14',
    estado: 'pendiente de entrega'
  }
];
}
