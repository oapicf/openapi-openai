/*
 * CreateModerationResponse_results_inner_category_scores.h
 *
 * A list of the categories along with their scores as predicted by model.
 */

#ifndef _CreateModerationResponse_results_inner_category_scores_H_
#define _CreateModerationResponse_results_inner_category_scores_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A list of the categories along with their scores as predicted by model.
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse_results_inner_category_scores : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationResponse_results_inner_category_scores();
	CreateModerationResponse_results_inner_category_scores(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationResponse_results_inner_category_scores();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The score for the category 'hate'.
	 */
	long long getHate();

	/*! \brief Set The score for the category 'hate'.
	 */
	void setHate(long long  hate);
	/*! \brief Get The score for the category 'hate/threatening'.
	 */
	long long getHatethreatening();

	/*! \brief Set The score for the category 'hate/threatening'.
	 */
	void setHatethreatening(long long  hatethreatening);
	/*! \brief Get The score for the category 'harassment'.
	 */
	long long getHarassment();

	/*! \brief Set The score for the category 'harassment'.
	 */
	void setHarassment(long long  harassment);
	/*! \brief Get The score for the category 'harassment/threatening'.
	 */
	long long getHarassmentthreatening();

	/*! \brief Set The score for the category 'harassment/threatening'.
	 */
	void setHarassmentthreatening(long long  harassmentthreatening);
	/*! \brief Get The score for the category 'illicit'.
	 */
	long long getIllicit();

	/*! \brief Set The score for the category 'illicit'.
	 */
	void setIllicit(long long  illicit);
	/*! \brief Get The score for the category 'illicit/violent'.
	 */
	long long getIllicitviolent();

	/*! \brief Set The score for the category 'illicit/violent'.
	 */
	void setIllicitviolent(long long  illicitviolent);
	/*! \brief Get The score for the category 'self-harm'.
	 */
	long long getSelfharm();

	/*! \brief Set The score for the category 'self-harm'.
	 */
	void setSelfharm(long long  selfharm);
	/*! \brief Get The score for the category 'self-harm/intent'.
	 */
	long long getSelfharmintent();

	/*! \brief Set The score for the category 'self-harm/intent'.
	 */
	void setSelfharmintent(long long  selfharmintent);
	/*! \brief Get The score for the category 'self-harm/instructions'.
	 */
	long long getSelfharminstructions();

	/*! \brief Set The score for the category 'self-harm/instructions'.
	 */
	void setSelfharminstructions(long long  selfharminstructions);
	/*! \brief Get The score for the category 'sexual'.
	 */
	long long getSexual();

	/*! \brief Set The score for the category 'sexual'.
	 */
	void setSexual(long long  sexual);
	/*! \brief Get The score for the category 'sexual/minors'.
	 */
	long long getSexualminors();

	/*! \brief Set The score for the category 'sexual/minors'.
	 */
	void setSexualminors(long long  sexualminors);
	/*! \brief Get The score for the category 'violence'.
	 */
	long long getViolence();

	/*! \brief Set The score for the category 'violence'.
	 */
	void setViolence(long long  violence);
	/*! \brief Get The score for the category 'violence/graphic'.
	 */
	long long getViolencegraphic();

	/*! \brief Set The score for the category 'violence/graphic'.
	 */
	void setViolencegraphic(long long  violencegraphic);

private:
	long long hate;
	long long hatethreatening;
	long long harassment;
	long long harassmentthreatening;
	long long illicit;
	long long illicitviolent;
	long long selfharm;
	long long selfharmintent;
	long long selfharminstructions;
	long long sexual;
	long long sexualminors;
	long long violence;
	long long violencegraphic;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationResponse_results_inner_category_scores_H_ */
