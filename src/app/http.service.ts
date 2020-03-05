import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { MeasuringStation } from './shared/measuring-station.model';

@Injectable({
	providedIn: 'root'
})
export class HttpService {
	constructor(private http: HttpClient) {}

	getMeasurmentStations(): Observable<Array<MeasuringStation>> {
		return this.http.get<Array<MeasuringStation>>('http://localhost:8080/stations');
	}
}
