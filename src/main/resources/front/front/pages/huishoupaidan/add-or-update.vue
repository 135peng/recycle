<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0","position":"relative","background":"#E4E6E1","height":"100%"}'>
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">回收编号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.huishoubianhao" v-model="ruleForm.huishoubianhao" placeholder="回收编号"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">衣服名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yifumingcheng" v-model="ruleForm.yifumingcheng" placeholder="衣服名称"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">衣服数量</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yifushuliang" v-model="ruleForm.yifushuliang" placeholder="衣服数量"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">预约时间</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.shangmenshijian" placeholder="预约时间" @tap="toggleTab('shangmenshijian')"></input>
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
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class=" select">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">回收工号</view>
				<picker :style='{"width":"100%","flex":"1","background":"rgba(190, 176, 167,.6)","height":"auto"}' @change="huishougonghaoChange" :value="huishougonghaoIndex"  :range="huishougonghaoOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{huishougonghaoOptions[huishougonghaoIndex]}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">员工姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(190, 176, 167,.6)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yuangongxingming" v-model="ruleForm.yuangongxingming" placeholder="员工姓名"></input>
			</view>
			
			<!-- 否 -->
 

			
			
			<view :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"100rpx","background":"#383428","width":"48%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="shangmenshijianConfirm" ref="shangmenshijian" themeColor="#333333"></w-picker>
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
				huishoubianhao: '',
				yifumingcheng: '',
				yifushuliang: '',
				shangmenshijian: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				shouji: '',
				dizhi: '',
				huishougonghao: '',
				yuangongxingming: '',
				},
				huishougonghaoOptions: [],
				huishougonghaoIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   huishoubianhao : false,
                   yifumingcheng : false,
                   yifushuliang : false,
                   shangmenshijian : false,
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   shouji : false,
                   dizhi : false,
                   huishougonghao : false,
                   yuangongxingming : false,
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
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;
			this.ruleForm.shouji = this.user.shouji
			this.ro.shouji = true;


			// 下2
			res = await this.$api.option(`huishourenyuan`,`huishougonghao`,{});
			this.huishougonghaoOptions = res.data;

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
				res = await this.$api.info(`huishoupaidan`, this.ruleForm.id);
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
					if(o=='yifushuliang'){
					this.ruleForm.yifushuliang = obj[o];
					this.ro.yifushuliang = true;
					continue;
					}
					if(o=='shangmenshijian'){
					this.ruleForm.shangmenshijian = obj[o];
					this.ro.shangmenshijian = true;
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
					if(o=='huishougonghao'){
					this.ruleForm.huishougonghao = obj[o];
					this.ro.huishougonghao = true;
					continue;
					}
					if(o=='yuangongxingming'){
					this.ruleForm.yuangongxingming = obj[o];
					this.ro.yuangongxingming = true;
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
			// 下二随
			async huishougonghaoChange (e) {
				this.huishougonghaoIndex = e.target.value
				this.ruleForm.huishougonghao = this.huishougonghaoOptions[this.huishougonghaoIndex]
				let res = await this.$api.follow(`huishourenyuan`, `huishougonghao`,{
					columnValue: this.ruleForm.huishougonghao
				});
				if(res.data.yuangongxingming){
					this.ruleForm.yuangongxingming = res.data.yuangongxingming
				}
			},

			// 多级联动参数


			// 日长控件选择日期时间
			shangmenshijianConfirm(val) {
				console.log(val)
				this.ruleForm.shangmenshijian = val.result;
				this.$forceUpdate();
			},



			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {





















//跨表计算判断
				var obj;
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
					let res = await this.$api.list(`huishoupaidan`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`huishoupaidan`, this.ruleForm);
						}else{
							await this.$api.add(`huishoupaidan`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`huishoupaidan`, this.ruleForm);
					}else{
						await this.$api.add(`huishoupaidan`, this.ruleForm);
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
