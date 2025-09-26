<template>
<view class="content">
	<view class="box" :style='{"width":"100%","padding":"0","position":"relative","background":"#f7f7f7","height":"100%"}'>
		<view :style='{"width":"100%","padding":"24rpx","background":"#e4e6e1","display":"block","height":"auto"}'>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>用户账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>密码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'  type="password" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>用户姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
			<view v-if="tableName=='yonghu'" :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class=" select">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
					<view :style='{"width":"100%","margin":"0 10rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#b27252"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>手机</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>地址</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.dizhi" placeholder="地址"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>头像</view>
				<image :style='{"width":"80rpx","margin":"0 10rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","margin":"0 10rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>积分</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.jifen" placeholder="积分"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>积分</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.jf" placeholder="积分"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='huishourenyuan'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>回收工号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.huishougonghao" placeholder="回收工号"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='huishourenyuan'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>密码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'  type="password" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='huishourenyuan'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>员工姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.yuangongxingming" placeholder="员工姓名"></input>
			</view>
			<view v-if="tableName=='huishourenyuan'" :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' class=" select">
				<view :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}' class="title">性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="huishourenyuanxingbieChange" :value="huishourenyuanxingbieIndex" :range="huishourenyuanxingbieOptions">
					<view :style='{"width":"100%","margin":"0 10rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#b27252"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='huishourenyuan'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>联系方式</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='huishourenyuan'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>身份证</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
			</view>
			<view :style='{"padding":"0","margin":"0 0 24rpx 0","alignItems":"center","borderRadius":"10rpx","background":"#fff","display":"flex","width":"100%","height":"auto"}' v-if="tableName=='huishourenyuan'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#b27252","borderRadius":"10rpx 0 0 10rpx","textAlign":"center","background":"rgba(204,204,204,.7)","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx"}'>积分</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.jf" placeholder="积分"></input>
			</view>
			<view :style='{"width":"100%","justifyContent":"center","display":"flex","height":"auto"}' class="btn">
				<button @tap="update()" class="cu-btn lg" :style='{"border":"0","padding":"0px","boxShadow":"10rpx 10rpx 4rpx rgba(56, 52, 40,.4)","margin":"0 20rpx","color":"#000","borderRadius":"20rpx","background":"#beb0a7","width":"168rpx","lineHeight":"80rpx","fontSize":"32rpx","fontWeight":"600","height":"80rpx"}'>保存</button>
				<button @tap="logout()" class="cu-btn lg" :style='{"border":"2rpx solid rgba(56, 52, 40,.5)","padding":"0px","margin":"0 20rpx","color":"#b27252","borderRadius":"20rpx","background":"rgb(255, 255, 255)","width":"168rpx","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				yonghuxingbieOptions: [],
				yonghuxingbieIndex: 0,
				huishourenyuanxingbieOptions: [],
				huishourenyuanxingbieIndex: 0,
			}
		},
        components: {
            multipleSelect
        },
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='yonghu'){
				this.yonghuxingbieOptions = "男,女".split(',');
				this.yonghuxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.yonghuxingbieIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='huishourenyuan'){
				this.huishourenyuanxingbieOptions = "男,女".split(',');
				this.huishourenyuanxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.huishourenyuanxingbieIndex = index;
					}
				});
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
			yonghutouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},
            // 下拉变化
            huishourenyuanxingbieChange(e) {
                    this.huishourenyuanxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.huishourenyuanxingbieOptions[this.huishourenyuanxingbieIndex]
            },

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('. .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if((!this.ruleForm.jifen) && `yonghu` == this.tableName){
					this.$utils.msg(`积分不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.jifen&&(!this.$validate.isIntNumer(this.ruleForm.jifen))){
					this.$utils.msg(`积分应输入整数`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.jf&&(!this.$validate.isNumber(this.ruleForm.jf))){
					this.$utils.msg(`积分应输入数字`);
					return
				}
				if((!this.ruleForm.huishougonghao) && `huishourenyuan` == this.tableName){
					this.$utils.msg(`回收工号不能为空`);
					return
				}
				if((!this.ruleForm.yuangongxingming) && `huishourenyuan` == this.tableName){
					this.$utils.msg(`员工姓名不能为空`);
					return
				}
				if(`huishourenyuan` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
				if(`huishourenyuan` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if(`huishourenyuan` == this.tableName && this.ruleForm.jf&&(!this.$validate.isNumber(this.ruleForm.jf))){
					this.$utils.msg(`积分应输入数字`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			},

		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
