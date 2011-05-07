package scalanlp
package stats
package expfam

import sampling.Measure
import optimize.DiffFunction

/**
 * 
 * @author dlwh
 */

trait ExponentialFamily[D<:Measure[T],T,Parameter]  {
  type SufficientStatistic <: expfam.SufficientStatistic[SufficientStatistic];
  def emptySufficientStatistic:SufficientStatistic;
  def sufficientStatisticFor(t: T):SufficientStatistic;
  def mle(stats: SufficientStatistic):Parameter
  def likelihoodFunction(stats: SufficientStatistic):DiffFunction[Parameter]
  def distribution(p: Parameter):D;
}