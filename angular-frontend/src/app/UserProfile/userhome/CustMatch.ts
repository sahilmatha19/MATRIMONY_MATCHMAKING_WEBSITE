export class CustMatch{
    name:string
    dob:string
    city:string
    photo:string

    constructor(name:string="User Name", dob:string="1 Jan, 2000", city:string="Pune", 
                photo:string=""){

            this.name=name
            this.dob=dob
            this.city=city
            this.photo=photo
        }
}