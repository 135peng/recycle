<template>
<view class="content">
	<view class="box" :style='{"width":"100%","padding":"24rpx","backgroundSize":"100% 100%","background":"url(http://codegen.caihongy.cn/20221028/eda5b2b547b14897a3d9330ccda0fc57.png)","height":"100vh"}'>
		<view :style='{"width":"100%","padding":"24rpx","margin":"0 auto","display":"block","height":"auto"}'>
			<image :style='{"border":"4rpx solid #666","boxShadow":"0px 0px 40rpx #e4e6e0","margin":"60rpx auto 35% auto","borderRadius":"100%","display":"block","width":"200rpx","height":"200rpx"}' src="http://codegen.caihongy.cn/20221028/3a62bb4d5bad4a9e97990312532980b4.webp" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.yonghuzhanghao"  type="text"  class="uni-input" name="" placeholder="用户账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.yonghuxingming"  type="text"  class="uni-input" name="" placeholder="用户姓名" />
			</view>
			<picker :style='{"width":"50%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.shouji"  type="text"  class="uni-input" name="" placeholder="手机" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.dizhi"  type="text"  class="uni-input" name="" placeholder="地址" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"boxShadow":"16rpx 16rpx 0 #999","margin":"0 0 40rpx 0","borderRadius":"20rpx","display":"block","width":"200rpx","float":"right","height":"200rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"boxShadow":"16rpx 16rpx 0 #999","margin":"0 0 40rpx 0","borderRadius":"20rpx","display":"block","width":"200rpx","float":"right","height":"200rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='huishourenyuan'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.huishougonghao"  type="text"  class="uni-input" name="" placeholder="回收工号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='huishourenyuan'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='huishourenyuan'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='huishourenyuan'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.yuangongxingming"  type="text"  class="uni-input" name="" placeholder="员工姓名" />
			</view>
			<picker :style='{"width":"50%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='huishourenyuan'"  @change="huishourenyuanxingbieChange" :value="huishourenyuanxingbieIndex" :range="huishourenyuanxingbieOptions">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='huishourenyuan'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.lianxifangshi"  type="text"  class="uni-input" name="" placeholder="联系方式" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='huishourenyuan'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #ccc","padding":"0px 24rpx","boxShadow":"0px 4rpx 10rpx rgba(76, 75, 72,.2)","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"100rpx","background":"rgb(255, 255, 255)","width":"100%","fontSize":"28rpx","height":"88rpx"}'  v-model="ruleForm.shenfenzheng"  type="text"  class="uni-input" name="" placeholder="身份证" />
			</view>
			<button :style='{"border":"0","padding":"0px","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"100rpx","background":"#383428","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
                huishourenyuanxingbieOptions: [],
                huishourenyuanxingbieIndex: 0,
				ruleForm: {
                yonghuzhanghao: '',
                mima: '',
                yonghuxingming: '',
                xingbie: '',
                shouji: '',
                dizhi: '',
                touxiang: '',
                jifen: '0',
                jf: '',
                huishougonghao: '',
                mima: '',
                yuangongxingming: '',
                xingbie: '',
                lianxifangshi: '',
                shenfenzheng: '',
                jf: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
            if(`yonghu` == this.tableName){
                this.ruleForm.jifen='0'
            }
                        // 自定义下拉框值
			if(this.tableName=='huishourenyuan'){
                this.huishourenyuanxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.huishourenyuanxingbieOptions[0]
			}
			
			this.styleChange()
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
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
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
                if(`huishourenyuan` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
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
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
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
