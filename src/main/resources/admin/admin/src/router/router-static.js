import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussjifenshangpin from '@/views/modules/discussjifenshangpin/list'
    import jiuyiwufenlei from '@/views/modules/jiuyiwufenlei/list'
    import jiuyixinxi from '@/views/modules/jiuyixinxi/list'
    import huishoudingdan from '@/views/modules/huishoudingdan/list'
    import huishourenyuan from '@/views/modules/huishourenyuan/list'
    import jifenduihuan from '@/views/modules/jifenduihuan/list'
    import users from '@/views/modules/users/list'
    import jifenshangpin from '@/views/modules/jifenshangpin/list'
    import huishouyuyue from '@/views/modules/huishouyuyue/list'
    import huishoupaidan from '@/views/modules/huishoupaidan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/discussjifenshangpin',
        name: '积分商品评论',
        component: discussjifenshangpin
      }
      ,{
	path: '/jiuyiwufenlei',
        name: '旧衣物分类',
        component: jiuyiwufenlei
      }
      ,{
	path: '/jiuyixinxi',
        name: '旧衣信息',
        component: jiuyixinxi
      }
      ,{
	path: '/huishoudingdan',
        name: '回收订单',
        component: huishoudingdan
      }
      ,{
	path: '/huishourenyuan',
        name: '回收人员',
        component: huishourenyuan
      }
      ,{
	path: '/jifenduihuan',
        name: '积分兑换',
        component: jifenduihuan
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/jifenshangpin',
        name: '积分商品',
        component: jifenshangpin
      }
      ,{
	path: '/huishouyuyue',
        name: '回收预约',
        component: huishouyuyue
      }
      ,{
	path: '/huishoupaidan',
        name: '回收派单',
        component: huishoupaidan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
