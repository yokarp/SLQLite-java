.Badge {
  background: #ffffff;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.1);
  border-radius: 8px 8px 8px 8px;
  overflow: hidden;
  height: 380px;
}

.Badge__header {
  padding: 0.5rem 0;
  height: 80px;
  background: #1b1b25;
  display: flex;
  justify-content: center;
}

.Badge__section-name {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 1rem 0;
}

.Badge__section-info {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 0.5rem 0;
  background: #f4f4f7;
}

.Badge__avatar {
  border-radius: 50%;
  margin-right: 1rem;
  width: 120px;
  height: 120px;
}

.Badge__footer {
  height: 54px;
  display: flex;
  justify-content: center;
  align-items: center;
  color: #98ca3f;
  font-weight: bold;
  font-style: italic;
}

@import url('https://fonts.googleapis.com/css?family=Lato:300,400,700');
@import url('https://fonts.googleapis.com/css?family=Anton');


* {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

body {
  font-family: 'Lato', 'Helvetica Neue', sans-serif;
  background-color: #F4F4F7;
}

h1 {
  font-family: 'Anton', sans-serif;
}

a.link-unstyled {
  color: inherit;
}

a.link-unstyled:hover {
  color: inherit;
  text-decoration: none;
}

.btn {
  padding: 0.375rem 2rem;
}

.btn.btn-primary {
  color: #fff;
  background-color: #7DCD40;
  border-color: #7DCD40;
}

.btn.btn-primary:not(:disabled):not(.disabled):hover {
  color: #fff;
  background-color: #7DCD40;
  border-color: #7DCD40;
}

.btn.btn-primary:not(:disabled):not(.disabled):active {
  color: #fff;
  background-color: #7DCD40;
  border-color: #7DCD40;
}

.btn.btn-primary:not(:disabled):not(.disabled):focus {
  box-shadow: 0 0 0 0.2rem rgba(125, 205, 64, 0.5);
}

.btn.btn-danger {
  color: #fff;
  background-color: #CD4040;
  border-color: #CD4040;
}

.btn.btn-danger:not(:disabled):not(.disabled):hover {
  color: #fff;
  background-color: #CD4040;
  border-color: #CD4040;
}

.btn.btn-danger:not(:disabled):not(.disabled):active {
  color: #fff;
  background-color: #CD4040;
  border-color: #CD4040;
}

.btn.btn-danger:not(:disabled):not(.disabled):focus {
  box-shadow: 0 0 0 0.2rem rgba(255, 64, 64, 0.5);
}```

.Navbar{
    width: 100%;
    padding: 0.5rem0;
    background-color: #1C3643;
}


.Navbar__brand{
    color:#ffffff;
    display: flex;
    align-items: center;
}

.Navbar__brand:hover{
    color:#ffffff;
    text-decoration: none;
}

.Navbar__brand-logo{
    margin-right: 0.5rem;
}


.BadgeNew__hero {
width: 100%;
padding: 2rem 0;
background: url(’…/…/images/stars.svg’), #1B1B25;
background-repeat: repeat;
margin-bottom: 1rem;
color: #ffffff;
}
