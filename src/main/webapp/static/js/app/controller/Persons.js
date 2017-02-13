
Ext.define('eCredit.controller.Persons', {
    extend: 'Ext.app.Controller',

    stores: ['Persons'],
    models: ['Person'],
    views: [
        'person.List',
        'person.Edit'
    ],

    init: function() {
        this.control({
            'viewport > PersonList': {
                itemdblclick : this.editPersons
            },
            'personEdit button[action=save]': {
                click: this.updatePerson
            }
        });
    },

    editPersons: function(grid, record) {
        var view = Ext.widget('personEdit');
        view.down('form').loadRecord(record);
    },

    updatePerson: function(button) {
        console.log('clicked the Save button');
        var win    = button.up('window'),
            form   = win.down('form'),
            record = form.getRecord(),
            values = form.getValues();

        record.set(values);
        win.close();
        //this.getUsersStore().sync();
    }

});