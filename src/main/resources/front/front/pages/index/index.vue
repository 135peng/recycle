<template>
<view class="content">
	<view :style='{"width":"100%","background":"#fff","height":"100%"}'>
		<swiper :style='{"width":"100%","background":"#fff","height":"360rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
			<swiper-item :style='{"width":"50%","backgroundSize":"100% 100%","backgroundImage":"url(http://codegen.caihongy.cn/20221029/c6062776d2144186acd5e1b2a4c411fd.png)","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"572rpx","margin":"20rpx 84rpx","objectFit":"cover","display":"block","height":"294rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333","background":"#fff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0","margin":"0","background":"#E4E6E1","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
            <block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"width":"20%","padding":"12rpx 0","margin":"10rpx 0","height":"auto"}' class="menu-list" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2('../'+child.tableName+'/list')">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0","margin":"0px auto","color":"#000","borderRadius":"20rpx","background":"#fff","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
                                <view :style='{"padding":"0","margin":"12rpx auto 0","color":"#666","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
																		<view class="listBox list">
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"100%","padding":"0 24rpx","margin":"0","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"margin":"0 20rpx","fontSize":"44rpx","lineHeight":"88rpx","color":"#000","fontWeight":"600"}'>废品信息</view>
				<text :style='{"color":"#beb0a7","fontSize":"32rpx","lineHeight":"88rpx"}' @tap="onPageTap('jiuyixinxi')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  <!-- 样式1 -->
		  <view class="list-box style1" :style='{"padding":"24rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('jiuyixinxi',product.id)" v-for="(product,index) in homejiuyixinxilist" :key="index" class="list-item" :style='{"boxShadow":"0 2rpx 12rpx rgba(0,0,0,.3)","margin":"0 0 32rpx","backgroundColor":"#fff","flexWrap":"wrap","display":"flex","width":"48%","height":"auto"}'>
			                			  			  			                			  <view :style='{"padding":"0px 20rpx","color":"#333","textAlign":"center","width":"100%","lineHeight":"60rpx","fontSize":"28rpx","order":"2"}' class="list-item-title ">废品名称:{{product.yifumingcheng}}</view>
			  			  			  			                			  			  			                			  			  <image :style='{"width":"100%","padding":"0","margin":"0","objectFit":"cover","display":"block","height":"300rpx"}' class="list-item-image" mode="aspectFill" v-if="product.yifutupian.substring(0,4)=='http'" :src="product.yifutupian"></image>
			  <image :style='{"width":"100%","padding":"0","margin":"0","objectFit":"cover","display":"block","height":"300rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.yifutupian?baseUrl+product.yifutupian.split(',')[0]:''"></image>
			  			  			                			  			  			                			  			  			                			  			  			                			  			  			                			  			  			                			  			  			                			  			  			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																				<view class="listBox list">
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"100%","padding":"0 24rpx","margin":"0","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"margin":"0 20rpx","fontSize":"44rpx","lineHeight":"88rpx","color":"#000","fontWeight":"600"}'>积分商品多多</view>
				<text :style='{"color":"#beb0a7","fontSize":"32rpx","lineHeight":"88rpx"}' @tap="onPageTap('jifenshangpin')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  <!-- 样式1 -->
		  <view class="list-box style1" :style='{"padding":"24rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('jifenshangpin',product.id)" v-for="(product,index) in homejifenshangpinlist" :key="index" class="list-item" :style='{"boxShadow":"0 2rpx 12rpx rgba(0,0,0,.3)","margin":"0 0 32rpx","backgroundColor":"#fff","flexWrap":"wrap","display":"flex","width":"48%","height":"auto"}'>
			                			  <view :style='{"padding":"0px 20rpx","color":"#333","textAlign":"center","width":"100%","lineHeight":"60rpx","fontSize":"28rpx","order":"2"}' class="list-item-title ">{{product.shangpinmingcheng}}</view>
			  			  			  			                			  			  <image :style='{"width":"100%","padding":"0","margin":"0","objectFit":"cover","display":"block","height":"300rpx"}' class="list-item-image" mode="aspectFill" v-if="product.shangpintupian.substring(0,4)=='http'" :src="product.shangpintupian"></image>
			  <image :style='{"width":"100%","padding":"0","margin":"0","objectFit":"cover","display":"block","height":"300rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.shangpintupian?baseUrl+product.shangpintupian.split(',')[0]:''"></image>
			  			  			                			  			  			                			  			  			                			  			  			                			  <view :style='{"padding":"0px 20rpx","color":"#333","textAlign":"center","width":"100%","lineHeight":"60rpx","fontSize":"28rpx","order":"2"}' class="list-item-title ">兑换积分:{{product.duihuanjifen}}</view>
			  			  			  			                			  			  			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																														<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
																																																		<view class="listBox news">
			<view v-if="false && 3 == 1" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"100%","padding":"0 24rpx","margin":"0","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"margin":"0 20rpx","fontSize":"44rpx","lineHeight":"88rpx","color":"#000","fontWeight":"600"}'>公告信息</view>
				<text :style='{"color":"#beb0a7","fontSize":"32rpx","lineHeight":"88rpx"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						
		  <!-- 样式4 -->
		  		  
		  <!-- 样式5 -->
		  		  
		  <!-- 样式6 -->
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  
		  <!-- 样式9 -->
		  		  <view class="news-box6" :style='{"width":"100%","padding":"24rpx","margin":"0","height":"auto"}'>
			<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"padding":"8rpx 24rpx 8rpx 80rpx","margin":"0 0 20rpx","borderColor":"#999","background":"#ebe7e4","borderWidth":"4rpx 0 4rpx 0","width":"100%","position":"relative","borderStyle":"dotted","height":"auto"}'>
			  <view :style='{"padding":"0","margin":"-30rpx 0 0 20rpx","color":"#a67252","textAlign":"center","borderRadius":"100%","top":"50%","left":"0","background":"rgba(204, 204, 204,.5)","width":"70rpx","lineHeight":"70rpx","fontSize":"32rpx","position":"absolute","height":"70rpx"}' class="num">
			    <view style="width: 100%;height: 100%;position: absolute;left: 0;top: 0;" :style="{transform: 'rotate('+(-index*60)+'deg)'}" class="dian">
			      <view :style='{"transform":"translateX(-50%)","borderRadius":"100%","top":"-8rpx","left":"50%","background":"red","display":"none","width":"16rpx","position":"absolute","height":"16rpx"}'></view>
			    </view>{{ index + 1 < 10 ? '0'+(index+1) : index+1 }}
			  </view>
			  <view class="item-list-body" :style='{"width":"100%","margin":"0","height":"auto"}'>
				<view :style='{"width":"100%","padding":"4rpx 20rpx","lineHeight":"1.4","fontSize":"28rpx","color":"#333"}' class="title ">{{item.title}}</view>
				<view :style='{"width":"100%","padding":"4rpx 20rpx","lineHeight":"1.2","fontSize":"28rpx","color":"#666"}' class="desc ">{{item.introduction}}</view>
			  </view>
			</view>
		  </view>
		  			
			<view v-if="false && 3 == 3" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
														<!-- 新闻资讯 -->
				

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 1,
				column: 6,
				iconArr: [
				  'cuIcon-same',
				  'cuIcon-deliver',
				  'cuIcon-evaluate',
				  'cuIcon-shop',
				  'cuIcon-ticket',
				  'cuIcon-cascades',
				  'cuIcon-discover',
				  'cuIcon-question',
				  'cuIcon-pic',
				  'cuIcon-filter',
				  'cuIcon-footprint',
				  'cuIcon-pulldown',
				  'cuIcon-pullup',
				  'cuIcon-moreandroid',
				  'cuIcon-refund',
				  'cuIcon-qrcode',
				  'cuIcon-remind',
				  'cuIcon-profile',
				  'cuIcon-home',
				  'cuIcon-message',
				  'cuIcon-link',
				  'cuIcon-lock',
				  'cuIcon-unlock',
				  'cuIcon-vip',
				  'cuIcon-weibo',
				  'cuIcon-activity',
				  'cuIcon-friendadd',
				  'cuIcon-friendfamous',
				  'cuIcon-friend',
				  'cuIcon-goods',
				  'cuIcon-selection'
				],
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				homejiuyixinxilist: [],
				homejifenshangpinlist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            this.role = uni.getStorageSync("role");
            let table = uni.getStorageSync("nowTable");
            let res = await this.$api.session(table);
            this.user = res.data;
            this.tableName = table;
            let menus = menu.list();
            this.menuList = menus;
            this.menuList.forEach((item,key) => {
                if(this.role==item.roleName) {
                    item.frontMenu.forEach((item2,key2) => {
                        if(item2.child[0].buttons.indexOf("查看")>-1) {
                            this.swiperMenuList.push(item2);
                        }
                    })
                }
            })
        },
		async onShow() {
            let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			// 公告信息
			res = await this.$api.list('news', {
				page: 1,
				limit: 6,
                sort: 'id',
                order: 'desc'
			});
			this.news = res.data.list


			res = await this.$api.list('jiuyixinxi', {
				page: 1,

				limit: 4
			});
			this.homejiuyixinxilist = res.data.list
			res = await this.$api.list('jifenshangpin', {
				page: 1,

				limit: 4
			});
			this.homejifenshangpinlist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(url) {
                uni.setStorageSync("useridTag",0);
                uni.navigateTo({
                    url: url,
                    fail: function() {
                        uni.switchTab({
                            url: url
                        });
                    }
                });
            }
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
