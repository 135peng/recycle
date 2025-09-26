<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0","position":"relative","background":"#E4E6E1","height":"100%"}'>
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">商品名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shangpinmingcheng" v-model="ruleForm.shangpinmingcheng" placeholder="商品名称"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="" @tap="shangpintupianTap">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">商品图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.shangpintupian" :src="baseUrl+ruleForm.shangpintupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">品牌</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.pinpai" v-model="ruleForm.pinpai" placeholder="品牌"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">数量</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shuliang" v-model="ruleForm.shuliang" placeholder="数量"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">兑换积分</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.duihuanjifen" v-model="ruleForm.duihuanjifen" placeholder="兑换积分"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">兑换规则</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.duihuanguize" placeholder="兑换规则"></textarea>
			</view>
			
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","fontWeight":"500"}' class="title">商品介绍</view>
                <xia-editor ref="editor" :style='{"minHeight":"300rpx","border":"2rpx solid #efefef","width":"100%","height":"auto"}' v-model="ruleForm.shangpinjieshao" placeholder="商品介绍" @editorChange="shangpinjieshaoChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"100rpx","background":"#383428","width":"48%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

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
				shangpinmingcheng: '',
				shangpintupian: '',
				shangpinjieshao: '',
				pinpai: '',
				shuliang: '',
				duihuanjifen: '',
				duihuanguize: '',
				},
				// 登录用户信息
				user: {},
                ro:{
                   shangpinmingcheng : false,
                   shangpintupian : false,
                   shangpinjieshao : false,
                   pinpai : false,
                   shuliang : false,
                   duihuanjifen : false,
                   duihuanguize : false,
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
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取



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
				res = await this.$api.info(`jifenshangpin`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='shangpinmingcheng'){
					this.ruleForm.shangpinmingcheng = obj[o];
					this.ro.shangpinmingcheng = true;
					continue;
					}
					if(o=='shangpintupian'){
					this.ruleForm.shangpintupian = obj[o].split(",")[0];
					this.ro.shangpintupian = true;
					continue;
					}
					if(o=='shangpinjieshao'){
					this.ruleForm.shangpinjieshao = obj[o];
					this.ro.shangpinjieshao = true;
					continue;
					}
					if(o=='pinpai'){
					this.ruleForm.pinpai = obj[o];
					this.ro.pinpai = true;
					continue;
					}
					if(o=='shuliang'){
					this.ruleForm.shuliang = obj[o];
					this.ro.shuliang = true;
					continue;
					}
					if(o=='duihuanjifen'){
					this.ruleForm.duihuanjifen = obj[o];
					this.ro.duihuanjifen = true;
					continue;
					}
					if(o=='duihuanguize'){
					this.ruleForm.duihuanguize = obj[o];
					this.ro.duihuanguize = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            shangpinjieshaoChange(e) {
                this.ruleForm.shangpinjieshao = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数




			shangpintupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.shangpintupian = 'upload/' + res.file;
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
				if(this.ruleForm.shuliang&&(!this.$validate.isIntNumer(this.ruleForm.shuliang))){
					this.$utils.msg(`数量应输入整数`);
					return
				}
				if(this.ruleForm.duihuanjifen&&(!this.$validate.isNumber(this.ruleForm.duihuanjifen))){
					this.$utils.msg(`兑换积分应输入数字`);
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
					let res = await this.$api.list(`jifenshangpin`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`jifenshangpin`, this.ruleForm);
						}else{
							await this.$api.add(`jifenshangpin`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`jifenshangpin`, this.ruleForm);
					}else{
						await this.$api.add(`jifenshangpin`, this.ruleForm);
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
