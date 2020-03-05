import { City } from './city.model';

export interface MeasuringStation {
	id?: number;
	stationName?: string;
	gegrLat?: string;
	gegrLon?: string;
	city?: City;
	addressStreet?: string;
}
