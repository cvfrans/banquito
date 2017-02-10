Ext.define('eCredit.view.persona.ViewPanelFormPersona',{
    extend: 'Ext.window.Window',
    alias: 'widget.ViewPanelFormPersona',
    height: 600,
    width: 500,
    layout: 'fit',
    title: 'Registrar Persona',
    autoShow: true,

    items: [
        {
            xtype: 'form',
            bodyPadding: 10,
            defaults:{
                anchor: '100%'
            },
            items: [
                {
                    xtype: 'textfield',
                    name: 'numeroDni',
                    fieldLabel: 'DNI'
                },
                {
                    xtype: 'textfield',
                    name: 'nombre',
                    fieldLabel: 'NOMBRES'
                },
                {
                    xtype: 'textfield',
                    name: 'apePaterno',
                    fieldLabel: 'APELLIDO PATERNO'
                },
                {
                    xtype: 'textfield',
                    name: 'apeMaterno',
                    fieldLabel: 'APELLIDO MATERNO'
                },
                {
                    xtype: 'textfield',
                    name: 'numeroRuc',
                    fieldLabel: 'RUC'
                },
                {
                    xtype: 'textfield',
                    name: 'razonSocial',
                    fieldLabel: 'RAZON SOCIAL'
                },
                {
                    xtype: 'textfield',
                    name: 'direccion',
                    fieldLabel: 'DIRECCION'
                },
                {
                    xtype: 'textfield',
                    name: 'sexo',
                    fieldLabel: 'SEXO'
                },
                {
                    xtype: 'textfield',
                    name: 'fechaNacimiento',
                    fieldLabel: 'F. NACIMIENTO'
                },
                {
                    xtype: 'textfield',
                    name: 'email',
                    fieldLabel: 'CORREO ELECTRONICO'
                },
                {
                    xtype: 'textfield',
                    name: 'telefonoFijo',
                    fieldLabel: 'TELEFONO FIJO'
                },
                {
                    xtype: 'textfield',
                    name: 'telefonoMovil',
                    fieldLabel: 'TELEFONO MOVIL'
                },
                {
                    xtype: 'textfield',
                    name: 'estadoCivil',
                    fieldLabel: 'ESTADO CIVIL'
                },
                {
                    xtype: 'textfield',
                    name: 'departamento',
                    fieldLabel: 'DEPARTAMENTO'
                },
                {
                    xtype: 'textfield',
                    name: 'provincia',
                    fieldLabel: 'PROVINCIA'
                },
                {
                    xtype: 'textfield',
                    name: 'distrito',
                    fieldLabel: 'DISTRITO'
                },
                {
                    xtype: 'textfield',
                    name: 'indel',
                    fieldLabel: 'indel',
                    hidden: true
                }
            ]
        }
    ],

    dockedItems: [
        {
            xtype: 'toolbar',
            dock: 'bottom',
            layout:{
                xtype: 'hbox',
                pack: 'end'
            },
            items: [
                {
                    xtype: 'button',
                    text: 'Cancelar',
                    itemId: 'cancel',
                    iconCls: 'icon-cancel'
                },
                {
                    xtype: 'button',
                    text: 'Guardar',
                    itemId: 'save',
                    iconCls: 'icon-save'
                }
            ]

        }
    ]


});