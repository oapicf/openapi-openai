/*
 * CreateModerationResponse_results_inner_categories.h
 *
 * 
 */

#ifndef _CreateModerationResponse_results_inner_categories_H_
#define _CreateModerationResponse_results_inner_categories_H_


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

class CreateModerationResponse_results_inner_categories : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationResponse_results_inner_categories();
	CreateModerationResponse_results_inner_categories(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationResponse_results_inner_categories();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getHate();

	/*! \brief Set 
	 */
	void setHate(bool  hate);
	/*! \brief Get 
	 */
	bool getHatethreatening();

	/*! \brief Set 
	 */
	void setHatethreatening(bool  hatethreatening);
	/*! \brief Get 
	 */
	bool getSelfharm();

	/*! \brief Set 
	 */
	void setSelfharm(bool  selfharm);
	/*! \brief Get 
	 */
	bool getSexual();

	/*! \brief Set 
	 */
	void setSexual(bool  sexual);
	/*! \brief Get 
	 */
	bool getSexualminors();

	/*! \brief Set 
	 */
	void setSexualminors(bool  sexualminors);
	/*! \brief Get 
	 */
	bool getViolence();

	/*! \brief Set 
	 */
	void setViolence(bool  violence);
	/*! \brief Get 
	 */
	bool getViolencegraphic();

	/*! \brief Set 
	 */
	void setViolencegraphic(bool  violencegraphic);

private:
	bool hate;
	bool hatethreatening;
	bool selfharm;
	bool sexual;
	bool sexualminors;
	bool violence;
	bool violencegraphic;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationResponse_results_inner_categories_H_ */
