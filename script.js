document.addEventListener('DOMContentLoaded', function() {
    const data = {
        items: [
            { name: "Item 1", price: 100 },
            { name: "Item 2", price: 200 }
        ]
    };

    let html = '<ul>';
    data.items.forEach(item => {
        html += `<li>${item.name} - $${item.price}</li>`;
    });
    html += '</ul>';

    document.getElementById('invoice-container').innerHTML = html;
});