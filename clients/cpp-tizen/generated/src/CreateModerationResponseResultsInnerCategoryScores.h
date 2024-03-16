/*
 * CreateModerationResponse_results_inner_category_scores.h
 *
 * 
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


/*! \brief 
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

	/*! \brief Get 
	 */
	long long getHate();

	/*! \brief Set 
	 */
	void setHate(long long  hate);
	/*! \brief Get 
	 */
	long long getHatethreatening();

	/*! \brief Set 
	 */
	void setHatethreatening(long long  hatethreatening);
	/*! \brief Get 
	 */
	long long getSelfharm();

	/*! \brief Set 
	 */
	void setSelfharm(long long  selfharm);
	/*! \brief Get 
	 */
	long long getSexual();

	/*! \brief Set 
	 */
	void setSexual(long long  sexual);
	/*! \brief Get 
	 */
	long long getSexualminors();

	/*! \brief Set 
	 */
	void setSexualminors(long long  sexualminors);
	/*! \brief Get 
	 */
	long long getViolence();

	/*! \brief Set 
	 */
	void setViolence(long long  violence);
	/*! \brief Get 
	 */
	long long getViolencegraphic();

	/*! \brief Set 
	 */
	void setViolencegraphic(long long  violencegraphic);

private:
	long long hate;
	long long hatethreatening;
	long long selfharm;
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
