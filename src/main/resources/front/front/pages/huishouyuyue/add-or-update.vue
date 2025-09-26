<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0","position":"relative","background":"#E4E6E1","height":"100%"}'>
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">回收编号</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0 10rpx 10rpx 0","flex":"1","background":"rgba(190, 176, 167,.6)","lineHeight":"80rpx","fontSize":"28rpx"}' class="right-input">
					{{ruleForm.huishoubianhao}}
				</view>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">废品名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yifumingcheng" v-model="ruleForm.yifumingcheng" placeholder="衣服名称"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="" @tap="yifutupianTap">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">废品图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.yifutupian" :src="baseUrl+ruleForm.yifutupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">废品数量</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yifushuliang" v-model="ruleForm.yifushuliang" placeholder="衣服数量"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">回收价格</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.huishoujiage" v-model="ruleForm.huishoujiage" placeholder="回收价格"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">赠送积分</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zengsongjifen" v-model="ruleForm.zengsongjifen" placeholder="赠送积分"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">预约时间</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.yuyueshijian" placeholder="预约时间" @tap="toggleTab('yuyueshijian')"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">用户账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">用户姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">手机</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shouji" v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">地址</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.dizhi" v-model="ruleForm.dizhi" placeholder="地址"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">备注</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.beizhu" v-model="ruleForm.beizhu" placeholder="备注"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class=" select">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">回收状态</view>
				<picker :style='{"width":"100%","flex":"1","background":"rgba(190, 176, 167,.6)","height":"auto"}' @change="huishouzhuangtaiChange" :value="huishouzhuangtaiIndex"  :range="huishouzhuangtaiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.huishouzhuangtai?ruleForm.huishouzhuangtai:"请选择回收状态"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">废品详情</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.yifuxiangqing" placeholder="衣服详情"></textarea>
			</view>
			
			
			<view :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"100rpx","background":"#383428","width":"48%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="yuyueshijianConfirm" ref="yuyueshijian" themeColor="#333333"></w-picker>
	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				 huishoubianhao: this.getUUID(),
				yifumingcheng: '',
				yifutupian: '',
				yifushuliang: '',
				huishoujiage: '',
				zengsongjifen: '',
				yuyueshijian: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				shouji: '',
				dizhi: '',
				yifuxiangqing: '',
				beizhu: '',
			        huishouzhuangtai: '未回收',
				shhf: '',
				},
				huishouzhuangtaiOptions: [],
				huishouzhuangtaiIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   huishoubianhao : false,
                   yifumingcheng : false,
                   yifutupian : false,
                   yifushuliang : false,
                   huishoujiage : false,
                   zengsongjifen : false,
                   yuyueshijian : false,
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   shouji : false,
                   dizhi : false,
                   yifuxiangqing : false,
                   beizhu : false,
                   huishouzhuangtai : false,
                   sfsh : false,
                   shhf : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
            this.ruleForm.yuyueshijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;
			this.ruleForm.shouji = this.user.shouji
			this.ro.shouji = true;


			// 自定义下拉框值
			this.huishouzhuangtaiOptions = "已回收,未回收".split(',')

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`huishouyuyue`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='huishoubianhao'){
					this.ruleForm.huishoubianhao = obj[o];
					this.ro.huishoubianhao = true;
					continue;
					}
					if(o=='yifumingcheng'){
					this.ruleForm.yifumingcheng = obj[o];
					this.ro.yifumingcheng = true;
					continue;
					}
					if(o=='yifutupian'){
					this.ruleForm.yifutupian = obj[o].split(",")[0];
					this.ro.yifutupian = true;
					continue;
					}
					if(o=='yifushuliang'){
					this.ruleForm.yifushuliang = obj[o];
					this.ro.yifushuliang = true;
					continue;
					}
					if(o=='huishoujiage'){
					this.ruleForm.huishoujiage = obj[o];
					this.ro.huishoujiage = true;
					continue;
					}
					if(o=='zengsongjifen'){
					this.ruleForm.zengsongjifen = obj[o];
					this.ro.zengsongjifen = true;
					continue;
					}
					if(o=='yuyueshijian'){
					this.ruleForm.yuyueshijian = obj[o];
					this.ro.yuyueshijian = true;
					continue;
					}
					if(o=='yonghuzhanghao'){
					this.ruleForm.yonghuzhanghao = obj[o];
					this.ro.yonghuzhanghao = true;
					continue;
					}
					if(o=='yonghuxingming'){
					this.ruleForm.yonghuxingming = obj[o];
					this.ro.yonghuxingming = true;
					continue;
					}
					if(o=='shouji'){
					this.ruleForm.shouji = obj[o];
					this.ro.shouji = true;
					continue;
					}
					if(o=='dizhi'){
					this.ruleForm.dizhi = obj[o];
					this.ro.dizhi = true;
					continue;
					}
					if(o=='yifuxiangqing'){
					this.ruleForm.yifuxiangqing = obj[o];
					this.ro.yifuxiangqing = true;
					continue;
					}
					if(o=='beizhu'){
					this.ruleForm.beizhu = obj[o];
					this.ro.beizhu = true;
					continue;
					}
					if(o=='huishouzhuangtai'){
					this.ruleForm.huishouzhuangtai = obj[o];
					this.ro.huishouzhuangtai = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			yuyueshijianConfirm(val) {
				console.log(val)
				this.ruleForm.yuyueshijian = val.result;
				this.$forceUpdate();
			},

			// 下拉变化
			huishouzhuangtaiChange(e) {
				this.huishouzhuangtaiIndex = e.target.value
				this.ruleForm.huishouzhuangtai = this.huishouzhuangtaiOptions[this.huishouzhuangtaiIndex]
			},

			yifutupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.yifutupian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {

































//跨表计算判断
				var obj;
				if(this.ruleForm.yifushuliang&&(!this.$validate.isIntNumer(this.ruleForm.yifushuliang))){
					this.$utils.msg(`衣服数量应输入整数`);
					return
				}
				if(this.ruleForm.huishoujiage&&(!this.$validate.isNumber(this.ruleForm.huishoujiage))){
					this.$utils.msg(`回收价格应输入数字`);
					return
				}
				if(this.ruleForm.zengsongjifen&&(!this.$validate.isNumber(this.ruleForm.zengsongjifen))){
					this.$utils.msg(`赠送积分应输入数字`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`huishouyuyue`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`huishouyuyue`, this.ruleForm);
						}else{
							await this.$api.add(`huishouyuyue`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`huishouyuyue`, this.ruleForm);
					}else{
						await this.$api.add(`huishouyuyue`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
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
