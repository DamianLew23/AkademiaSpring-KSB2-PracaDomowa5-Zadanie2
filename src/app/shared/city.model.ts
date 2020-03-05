import { Commune } from './commune.model';

export interface City {
	id?: number;
	name?: string;
	commune?: Commune;
}
