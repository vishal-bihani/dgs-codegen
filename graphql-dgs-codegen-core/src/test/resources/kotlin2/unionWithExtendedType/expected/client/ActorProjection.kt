package kotlin2.unionWithExtendedType.expected.client

import com.netflix.graphql.dgs.client.codegen.GraphQLProjection

public class ActorProjection : GraphQLProjection() {
  public val name: ActorProjection
    get() {
      field("name")
      return this
    }
}
