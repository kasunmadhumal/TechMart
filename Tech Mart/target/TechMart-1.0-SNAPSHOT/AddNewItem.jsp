
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="resources/Include/header.jsp" %>
<%@ include file="resources/Include/NavigationBar3.jsp" %>
<link rel="stylesheet" href="resources/Include/CSS/AddNewSalesAgent.css">



<div id="content" style="text-align: center;">

  <form method="get" action="AddNewItemController" enctype="multipart/form-data">
    <nav style="color: greenyellow; background-color:blue">

      <h1>Item Data</h1>
    </nav>

    <!--main category -->
    <div class="mb-3">

      <div class="dropdown">
        <label for="mainCategory" class="form-label">main category</label>

        <select id="mainCategory"  name="mainCategory">
          <option value="" ></option>
          <option value="phone">phone</option>
          <option value="headset">headset</option>
          <option value="charger">charger</option>
          <option value="phone Cover">phoneCover</option>
          <option value="power Bank">powerBank</option>
          <option value="display Tempered">displayTempered</option>
          <option value="baterry">baterry</option>
          <option value="cables">cables</option>
          <option value="memory Device">memoryDevice</option>
          <option value="smart Watch">smartWatch</option>
          <option value="selfi sticks">selfi sticks</option>

        </select>


      </div>
    </div>



    <!-- subcategory -->
    <div class="mb-3">

      <div class="dropdown">
        <label for="subCategory" class="form-label">subCategory</label>
        <select id="subCategory"  name="subCategory">
          <option value="" ></option>
          <option value="half Touch Mobiles">half Touch Mobiles</option>
          <option value="keypad Mobiles">keypad Mobiles</option>
          <option value="bluetooth Headset">bluetooth Headset</option>
          <option value="head Phones" >head Phones</option>
          <option value="wired Headset" >wired Headset</option>
          <option value="wireless Charger" >wireless Charger</option>
          <option value="charger Adapter" >charger Adapter</option>
          <option value="cable Charger" >cable Charger</option>
          <option value="back cover" >back cover</option>
          <option value="full cover" >full cover</option>
          <option value="5600w" >5600w</option>
          <option value="7800w" >7800w</option>
          <option value="4800w" >4800w</option>
          <option value="full tempered" >full tempered</option>
          <option value="half tempered" >half tempered</option>
          <option value="smart phone battery" >smart phone battery</option>
          <option value="normal phone battery" >normal phone battery</option>
          <option value="usb cables" >usb cables</option>
          <option value="C port cables" >C port cables</option>
          <option value="micro port cables" >micro port cables</option>
          <option value="usb converter cables" >usb converter cables</option>
          <option value="memory chip 32gb" >memory chip 32gb</option>
          <option value="memory chip 64gb" >memory chip 64gb</option>
          <option value="memory chip 4gb" >memory chip 4gb</option>
          <option value="pendrive 8bg" >pendrive 8bg</option>
          <option value="pendrive 16bg" >pendrive 16bg</option>
          <option value="pendrive 64bg" >pendrive 64b</option>
          <option value="mid range smart phone" >mid range smart phone</option>
          <option value="budget smart phone" >budget smart phone</option>
          <option value="flagships smart phone" >flagships smart phone</option>
          <option value="smart watch" >smart watch</option>

        </select>

      </div>
    </div>





    <!-- brand  -->
    <div class="mb-3">

      <div class="dropdown">
        <label for="brandOfProduct" class="form-label">Brand of Product</label>
        <select id="brandOfProduct"  name="brandOfProduct">
          <option value="" ></option>
          <option value="huawei">huawei</option>
          <option value="samsung">samsung</option>
          <option value="apple">apple</option>
          <option value="oppo">oppo</option>
          <option value="redmi" >redmi</option>
          <option value="sony" >sony</option>
          <option value="Anker" >Anker</option>
          <option value="Aukey" >Aukey</option>
          <option value="Toshiba" >Toshiba</option>
          <option value="HUAWEI nova 8i">HUAWEI nova 8i</option>
          <option value="HUAWEI nova 7 SE">HUAWEI nova 7 SE</option>
          <option value="HUAWEI Y5p">HUAWEI Y5p</option>
          <option value="HUAWEI Y6p">HUAWEI Y6p</option>
          <option value="HUAWEI P30 Pro">HUAWEI P30 Pro</option>
          <option value="HUAWEI Y5 lite">HUAWEI Y5 lite</option>
          <option value="Samsung Galaxy S22+">Samsung Galaxy S22+</option>
          <option value="Samsung Galaxy S22 Ultra 5G">Samsung Galaxy S22 Ultra 5G</option>
          <option value="Samsung Galaxy Note 20">Samsung Galaxy Note 20</option>
          <option value="Samsung Galaxy Note 9">Samsung Galaxy Note 9</option>
          <option value="Apple iPhone 12">Apple iPhone 12</option>
          <option value="Apple iPhone 14 Pro Max">Apple iPhone 14 Pro Max</option>
          <option value="Apple iPhone 12 Mini">Apple iPhone 12 Mini</option>
          <option value="Apple iPhone 11">Apple iPhone 11</option>
          <option value="Apple iPhone SE 2020">Apple iPhone SE 2020</option>
          <option value="redmi note 9" >redmi note 9</option>
          <option value="redmi note 10s" >redmi note 10s</option>
          <option value="redmi 10s pro" >redmi 10s pro</option>
          <option value="Xiaomi 11T" >Xiaomi 11T </option>
          <option value="Xiaomi 11 Lite 5G NE" >Xiaomi 11 Lite 5G NE</option>


        </select>

      </div>
    </div>









    <!-- Price of one item-->
    <div>
      <label for="priceOfProduct" class="form-label">Price Of product</label>
      <input type="number" name="priceOfProduct" id="priceOfProduct" value=""  />

    </div>



    <div>
      <label for="color" class="form-label">color</label>
      <input type="text" name="color" id="color" value=""  />

    </div>





    <!--Count of items -->
    <div>
      <label for="instock" class="form-label">instock</label>
      <input type="number" name="instock" id="instock" value=""  />

    </div>



    <div>
      <label for="warranty" class="form-label">warranty</label>
      <input type="text" name="warranty" id="warranty" value=""  />

    </div>


    <div>
      <label for="discription" class="form-label">discription</label>
      <input type="text" name="discription" id="discription" value=""  />

    </div>


    <div>
      <label for="rating" class="form-label">rating</label>
      <input type="number" name="rating" id="rating" value=""  />

    </div>









    <!--Upload image file -->
    <div>
      <label for="uploadfile" class="form-label">Upload image file</label>
      <input type="file" name="uploadfile" value="" id="uploadfile" />
    </div>




    <div>
      <label for="discription" class="form-label">branch</label>
      <input type="text" name="branch" id="branch" value=""  />

    </div>




    <div>
      <button type="submit" name="upload" id="upload">UPLOAD</button>
    </div>
  </form>


</div>
















</body>
</html>