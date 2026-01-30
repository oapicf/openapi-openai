/*
 * CreateModerationResponse_results_inner_category_applied_input_types.h
 *
 * A list of the categories along with the input type(s) that the score applies to.
 */

#ifndef _CreateModerationResponse_results_inner_category_applied_input_types_H_
#define _CreateModerationResponse_results_inner_category_applied_input_types_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A list of the categories along with the input type(s) that the score applies to.
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse_results_inner_category_applied_input_types : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationResponse_results_inner_category_applied_input_types();
	CreateModerationResponse_results_inner_category_applied_input_types(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationResponse_results_inner_category_applied_input_types();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The applied input type(s) for the category 'hate'.
	 */
	std::list<std::string> getHate();

	/*! \brief Set The applied input type(s) for the category 'hate'.
	 */
	void setHate(std::list <std::string> hate);
	/*! \brief Get The applied input type(s) for the category 'hate/threatening'.
	 */
	std::list<std::string> getHatethreatening();

	/*! \brief Set The applied input type(s) for the category 'hate/threatening'.
	 */
	void setHatethreatening(std::list <std::string> hatethreatening);
	/*! \brief Get The applied input type(s) for the category 'harassment'.
	 */
	std::list<std::string> getHarassment();

	/*! \brief Set The applied input type(s) for the category 'harassment'.
	 */
	void setHarassment(std::list <std::string> harassment);
	/*! \brief Get The applied input type(s) for the category 'harassment/threatening'.
	 */
	std::list<std::string> getHarassmentthreatening();

	/*! \brief Set The applied input type(s) for the category 'harassment/threatening'.
	 */
	void setHarassmentthreatening(std::list <std::string> harassmentthreatening);
	/*! \brief Get The applied input type(s) for the category 'illicit'.
	 */
	std::list<std::string> getIllicit();

	/*! \brief Set The applied input type(s) for the category 'illicit'.
	 */
	void setIllicit(std::list <std::string> illicit);
	/*! \brief Get The applied input type(s) for the category 'illicit/violent'.
	 */
	std::list<std::string> getIllicitviolent();

	/*! \brief Set The applied input type(s) for the category 'illicit/violent'.
	 */
	void setIllicitviolent(std::list <std::string> illicitviolent);
	/*! \brief Get The applied input type(s) for the category 'self-harm'.
	 */
	std::list<std::string> getSelfharm();

	/*! \brief Set The applied input type(s) for the category 'self-harm'.
	 */
	void setSelfharm(std::list <std::string> selfharm);
	/*! \brief Get The applied input type(s) for the category 'self-harm/intent'.
	 */
	std::list<std::string> getSelfharmintent();

	/*! \brief Set The applied input type(s) for the category 'self-harm/intent'.
	 */
	void setSelfharmintent(std::list <std::string> selfharmintent);
	/*! \brief Get The applied input type(s) for the category 'self-harm/instructions'.
	 */
	std::list<std::string> getSelfharminstructions();

	/*! \brief Set The applied input type(s) for the category 'self-harm/instructions'.
	 */
	void setSelfharminstructions(std::list <std::string> selfharminstructions);
	/*! \brief Get The applied input type(s) for the category 'sexual'.
	 */
	std::list<std::string> getSexual();

	/*! \brief Set The applied input type(s) for the category 'sexual'.
	 */
	void setSexual(std::list <std::string> sexual);
	/*! \brief Get The applied input type(s) for the category 'sexual/minors'.
	 */
	std::list<std::string> getSexualminors();

	/*! \brief Set The applied input type(s) for the category 'sexual/minors'.
	 */
	void setSexualminors(std::list <std::string> sexualminors);
	/*! \brief Get The applied input type(s) for the category 'violence'.
	 */
	std::list<std::string> getViolence();

	/*! \brief Set The applied input type(s) for the category 'violence'.
	 */
	void setViolence(std::list <std::string> violence);
	/*! \brief Get The applied input type(s) for the category 'violence/graphic'.
	 */
	std::list<std::string> getViolencegraphic();

	/*! \brief Set The applied input type(s) for the category 'violence/graphic'.
	 */
	void setViolencegraphic(std::list <std::string> violencegraphic);

private:
	std::list <std::string>hate;
	std::list <std::string>hatethreatening;
	std::list <std::string>harassment;
	std::list <std::string>harassmentthreatening;
	std::list <std::string>illicit;
	std::list <std::string>illicitviolent;
	std::list <std::string>selfharm;
	std::list <std::string>selfharmintent;
	std::list <std::string>selfharminstructions;
	std::list <std::string>sexual;
	std::list <std::string>sexualminors;
	std::list <std::string>violence;
	std::list <std::string>violencegraphic;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationResponse_results_inner_category_applied_input_types_H_ */
