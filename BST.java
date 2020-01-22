class BSTNode
{
    int val;
    BSTNode left;
    BSTNode right;
    BSTNode(int v)
    {
        val=v;
        left=null;
        right=null;
    }
}
class BST
{
    BSTNode root,hop;
    BST()
    {
        root=null;
        hop=null;
    }
    public void add(int v)
    {
       BSTNode ob=new BSTNode(v);
       if(hop==null)
       {
           root=hop=ob;
       } 
       else
       {
           hop=root;
           while(hop!=null)
           {
               if(ob.val<hop.val)
               {
                   if(hop.left==null)
                   {
                       break;
                   }
                   else{
                       hop=hop.left;
                   }
               }
               else
               {
                   if(hop.right==null)
                   {
                       break;
                   }
                   else
                   {
                       hop=hop.right;
                   }
               }
           }
           if(hop.val>ob.val)
           {
               hop.left=ob;
           }
           else
           {
               hop.right=ob;
           }
       }
    }
    public void delete(int n)
    {
        BSTNode s=search(n);
        BSTNode p=parent(s);
        if(s.left==null&&s.right==null)
        {
            del0cn(s,p);
        }
        else if(s.left!=null&&s.right==null)
        {
            del1lcn(s,p);
        }
        else if(s.left==null&&s.right!=null)
        {
            del1rcn(s,p);
        }
        else if(s.left!=null&&s.right!=null)
        {
            del2cn(s,p);
        }
    }
    public void del0cn(BSTNode f,BSTNode p)
    {
        if(p.left==f)
        {
            p.left=null;
        }
        else
        {
            p.right=null;
        }
    }
    public void del1rcn(BSTNode f,BSTNode p)
    {
        if(p.left==f)
        {
            p.left=f.right;
        }
        else
        {
            p.right=f.right;
        }
    }
    public void del2cn(BSTNode f,BSTNode p)
    {
        BSTNode h=f;
        BSTNode hp=f;
        h=h.left;
        while(h.left!=null)
        {
            hp=hp.left;
            h=h.left;
        }
        hp.left=null;
        if(p.left==f)
        {
            p.left=h;
            h.left=f.left;
            h.right=f.right;
        }
        else
        {
            p.right=h;
            h.right=f.right;
            h.left=f.left;
        }
    }
    public void del1lcn(BSTNode f,BSTNode p)
    {
        if(p.left==f)
        {
            p.left=f.left;
        }
        else
        {
            p.right=f.left;
        }
    }
    public BSTNode search(int n)
    {
        BSTNode b=root;
        while(b!=null)
        {
            if(b.val<n)
            {
                b=b.right;
            }
            else if(b.val>n)
            {
                b=b.left;
            }
            else
            {
                break;
            }
        }
        return b;
    }
    public BSTNode parent(BSTNode f)
    {
        BSTNode h=root;
        while(h!=null)
        {
            if(f.val<=h.val)
            {
                if(h.left==f)
                {
                    break;
                }
                h=h.left;
            }
            else
            {
                if(h.right==f)
                {
                    break;
                }
                h=h.right;
            }
            
        }
        return h;
    }
    public void preorder(BSTNode node)
    {
        if(node==null)
        {
            return;
        }
        else
        {
            System.out.print(node.val);
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void inorder(BSTNode node)
    {
        if(node==null)
        {
            return;
        }
        else
        {
            inorder(node.left);
            System.out.print(node.val);
            inorder(node.right);
        }
    }
    public void postorder(BSTNode node)
    {
        if(node==null)
        {
            return;
        }
        else
        {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.val);
            
        }
    }

    public static void main(String args[])
    {
        BST b=new BST();
        b.add(2);
        b.add(4);
        b.add(1);
        b.add(7);
        b.add(3);
        b.delete(4);
        b.postorder(b.root);
        b.inorder(b.root);
        b.preorder(b.root);
    }
}