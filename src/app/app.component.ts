import { Component, OnInit } from '@angular/core';
import { HttpService } from './http.service';
import { MeasuringStation } from './shared/measuring-station.model';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: [ './app.component.css' ]
})
export class AppComponent implements OnInit {
	title = 'teai-pracadomowa5-zadanie1';

	measurmentStations: Array<MeasuringStation>;

	constructor(private httpService: HttpService) {}

	ngOnInit() {
		this.httpService.getMeasurmentStations().subscribe((measurmentStations) => {
			this.measurmentStations = measurmentStations;
			console.log(this.measurmentStations);
		});
	}
}
