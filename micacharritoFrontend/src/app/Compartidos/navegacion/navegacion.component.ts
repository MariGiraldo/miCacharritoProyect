import { Component } from '@angular/core';
import { RouterOutlet} from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';



@Component({
  selector: 'app-navegacion',
  standalone: true,
  imports: [RouterOutlet,FormsModule,CommonModule],
  templateUrl: './navegacion.component.html',
  styleUrl: './navegacion.component.css'
})
export class NavegacionComponent {

 tiposVehiculo: string[] = ['Motocicleta', 'Campero', 'Microbús', 'Automóvil', 'Camioneta'];
 tipoSeleccionado: string = '';

seleccionarTipo(tipo: string): void {
  this.tipoSeleccionado = tipo;
}

filtrarPorTipo() {
  if (this.tipoSeleccionado) {
    // Aquí puedes navegar a una ruta, emitir evento, o hacer la lógica que necesites
    console.log("Filtrando por:", this.tipoSeleccionado);
  }
}
}
