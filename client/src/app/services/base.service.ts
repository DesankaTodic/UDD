import { HttpHeaders } from "@angular/common/http";
import { Observable, of } from 'rxjs';

export class BaseService {
  /**
  * Handle Http operation that failed.
  * Let the app continue.
  * @param operation - name of the operation that failed
  * @param result - optional value to return as the observable result
  */
  protected handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      console.log(`${operation} failed: ${error.message}`);

      if (error.status == 417) {
        return of(error as T);
      }

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}